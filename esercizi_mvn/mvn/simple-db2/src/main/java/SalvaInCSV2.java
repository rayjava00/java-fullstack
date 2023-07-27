import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalvaInCSV2 {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database_collegato.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Eseguo la query JOIN
            String sql = "SELECT mammiferi.nome AS nome_mammifero, mammiferi.specie, mammiferi.alimentazione, mammiferi.habitat,  categoria_animali.nome AS categoria_animale "
                    +
                    "FROM mammiferi " +
                    "JOIN categoria_animali ON mammiferi.id_animale = categoria_animali.id;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Preparo il file CSV
            FileWriter fileWriter = new FileWriter("mammiferi_categoria_animali.csv");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Nome , Specie, Alimentazione, Habitat, Categoria"); // Intestazione del CSV

            // Stampo i risultati nel file CSV
            while (rs.next()) {
                String nomeMammifero = rs.getString("nome_mammifero");
                String specie = rs.getString("specie");
                String alimentazione = rs.getString("alimentazione");
                String habitat = rs.getString("habitat");
                String nomeAnimale = rs.getString("categoria_animale");

                printWriter.println(
                        nomeMammifero + ", " + specie + ", " + alimentazione + ", " + habitat + ", " + nomeAnimale);
            }

            printWriter.close();
            System.out.println("I dati sono stati salvati nel file 'mammiferi_categoria_animali.csv'.");

        } catch (SQLException | ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}