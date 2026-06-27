import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionExample {
    public static void connect() {
        String databaseUrl = "jdbc:sqlite:database.db";

        try {
            Connection connection = DriverManager.getConnection(databaseUrl);

            if (connection != null) {
                System.out.println("Connection to database has been established.");
                connection.close();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
