import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InserisciDati2 {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database_collegato.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Inserisco i dati nella tabella 'categoria_animali'
            String sql1 = "INSERT INTO categoria_animali (id, nome) VALUES (1, 'Mammifero');";
            String sql2 = "INSERT INTO categoria_animali (id, nome) VALUES (2, 'Mammifero');";
            String sql6 = "INSERT INTO categoria_animali (id, nome) VALUES (3, 'Mammifero');";
            // 'Mammifero');";

            Statement stmt1 = conn.createStatement();
            stmt1.execute(sql1);

            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);
            Statement stmt6 = conn.createStatement();
            stmt6.execute(sql6);

            // Inserisco i dati nella tabella 'prodotti'
            String sql3 = "INSERT INTO mammiferi (nome, specie, alimentazione, habitat, id_animale) VALUES ('Tigre','Panthera tigris altaica', 'carnivora', 'foresta',  1);";
            String sql4 = "INSERT INTO mammiferi (nome, specie, alimentazione, habitat, id_animale) VALUES ('Delfino','Delphinidae', 'carnivora', 'oceano', 2);";
            String sql5 = "INSERT INTO mammiferi (nome, specie, alimentazione, habitat, id_animale) VALUES ('Canguro','Macropus rufus', 'erbivora', 'australia', 3);";

            Statement stmt3 = conn.createStatement();
            stmt3.execute(sql3);

            Statement stmt4 = conn.createStatement();
            stmt4.execute(sql4);

            Statement stmt5 = conn.createStatement();
            stmt5.execute(sql5);

            System.out.println("I dati sono stati inseriti nelle tabelle 'categoria_animali' e 'mammiferi'.");

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