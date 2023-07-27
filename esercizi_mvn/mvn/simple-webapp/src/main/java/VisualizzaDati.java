import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VisualizzaDati {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");
            String csvFile = "./prodotto.csv";
            String header = "ID Prodotto,Quantita;Categoria,Prezzo\n";
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(csvFile);

                fileWriter.append(header);

                // Eseguo la query SELECT
                String sql = "SELECT * FROM prodotti;";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                // Stampo i risultati
                while (rs.next()) {
                    String nomeProdotto = rs.getString("nome_prodotto");
                    int quantita = rs.getInt("quantità");
                    String categoriaProdotto = rs.getString("categoria_prodotto");
                    double prezzoProdotto = rs.getDouble("prezzo_prodotto");
                    fileWriter.append(str);
                    fileWriter.append("\n");
                    System.out.println("Nome_prodotto: " + nomeProdotto + ", Quantità: " + quantita
                            + ", Categoria Prodotto: " + categoriaProdotto + ", Prezzo Prodotto: " + prezzoProdotto);
                }
            } catch (Exception e) {
                System.out.println("Errore in Csv FileWriter");
                e.printStackTrace();
            } finally { // ???? non sn riuscito a copiare
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Errore durante il flush");
                    e.printStackTrace();
                }

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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