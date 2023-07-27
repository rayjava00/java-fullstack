
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Modifica {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Modifico il prezzo della mela
            String sql = "UPDATE prodotti SET nome_prodotto = 'Banana' WHERE nome_prodotto = 'Mela';";
            // "ALTER TABLE prodotti ADD COLUMN prezzo_prodotto real;";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);

            System.out.println("Il nome della mela � stato modificato.");

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