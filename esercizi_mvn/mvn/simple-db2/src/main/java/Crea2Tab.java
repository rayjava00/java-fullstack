import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crea2Tab {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database_collegato.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Creo la tabella 'animali'
            String sql1 = "CREATE TABLE IF NOT EXISTS categoria_animali (\n"
                    + " id integer PRIMARY KEY,\n"
                    + " nome text NOT NULL\n"
                    + ");";

            // Creo la tabella 'mammiferi' con una chiave esterna che si riferisce alla
            // tabella 'categorie'
            String sql2 = "CREATE TABLE IF NOT EXISTS mammiferi (\n"
                    + " id integer PRIMARY KEY,\n"
                    + " nome text NOT NULL,\n"
                    + " specie text NOT NULL,\n"
                    + " alimentazione text NOT NULL,\n"
                    + " habitat text NOT NULL,\n"
                    + " id_animale integer,\n"
                    + " FOREIGN KEY(id_animale) REFERENCES categoria_animali(id)\n"
                    + ");";

            Statement stmt1 = conn.createStatement();
            stmt1.execute(sql1);

            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);

            System.out.println("Tabelle 'categoria_animali' e 'mammiferi' create.");

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