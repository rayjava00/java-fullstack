import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreaDB3 {

    public static void main(String[] args) {

        Connection conn = null;
        try {
            // Carico il driver JDBC di SQLite
            Class.forName("org.sqlite.JDBC");

            // Creo una connessione al database
            String url = "jdbc:sqlite:database.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connessione a SQLite stabilita.");

            // Creo la tabella
            String sql = "CREATE TABLE IF NOT EXISTS prodotti (\n"
                    + "ID_prodotto integer NOT NULL,\n"
                    + "nome_prodotto text NOT NULL,\n"
                    + "categoria_prodotto integer NULL,\n"
                    + "prezzo_prodotto integer NOT NULL,\n"
                    + "quantita_prodotto integer NOT NULL,\n"
                    + "data_vendita text NOT NULL\n"
                    + ");";

            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            String sql1 = "INSERT INTO prodotti (ID_prodotto, nome_prodotto, categoria_prodotto, prezzo_prodotto, quantita_prodotto, data_vendita) VALUES (1, 'Mela', 'Frutta', 0.50 , 100 , '2023-06-10');";
            String sql2 = "INSERT INTO prodotti (ID_prodotto, nome_prodotto, categoria_prodotto, prezzo_prodotto, quantita_prodotto, data_vendita) VALUES (2, 'Panino', 'Pane', 1.00 , 50 , '2023-07-5');";
            String sql3 = "INSERT INTO prodotti (ID_prodotto, nome_prodotto, categoria_prodotto, prezzo_prodotto, quantita_prodotto, data_vendita) VALUES (3, 'Latte', 'Latticini', 1.50 , 39 , '2023-05-16');";
            Statement stmt1 = conn.createStatement();
            stmt1.execute(sql1);

            Statement stmt2 = conn.createStatement();
            stmt2.execute(sql2);

            Statement stmt3 = conn.createStatement();
            stmt3.execute(sql3);

            System.out.println("I dati di esempio sono stati inseriti.");

            System.out.println("Tabella 'prodotti' creata.");

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