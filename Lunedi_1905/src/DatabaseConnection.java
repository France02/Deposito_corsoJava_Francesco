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
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC non trovato. Assicurati di aver aggiunto il JAR.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Errore nella connessione al database.");
            e.printStackTrace();
        }
    }
}