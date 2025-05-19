package Lunedi_1905.src;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
        String user = "root";
        String password = "Rootroot1102@";

        try {
            // Carica il driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connessione al database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connessione riuscita!");
            String sql = """
                            SELECT 
                                f.title AS film_title,
                                COUNT(r.rental_id) AS total_rentals
                            FROM 
                                rental r
                            JOIN 
                                inventory i ON r.inventory_id = i.inventory_id
                            JOIN 
                                film f ON i.film_id = f.film_id
                            GROUP BY 
                                f.film_id, f.title
                            ORDER BY 
                                total_rentals DESC
                            LIMIT 10;
                            """;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

             System.out.println("\n10 Film più noleggiati:");
                while (rs.next()) {
                    String title = rs.getString("film_title");
                    int rentals = rs.getInt("total_rentals");
                    System.out.println(title + " - " + rentals + " noleggi");
                }

        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC non trovato. Assicurati di aver aggiunto il JAR.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Errore nella connessione al database.");
            e.printStackTrace();
        }
    }
}