import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        var url = "jdbc:sqlite:jdbc.db";

        var sql = "CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY, name VARCHAR(10) NOT NULL, is_admin boolean NOT NULL);";

        try (var connection = DriverManager.getConnection(url);
             var statement = connection.createStatement();
        ) {
            statement.execute(sql);
            System.out.println("Query executed with sucess!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
