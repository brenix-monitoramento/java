import java.sql.DriverManager;

public class Insert {
    public static void main() {
        String url = "jdbc:sqlite:jdbc.db";

        String query = "INSERT INTO user (id, name, is_admin) VALUES (?, ?, ?);";

        try (var connection = DriverManager.getConnection(url);
             var statement = connection.prepareStatement(query);
        ) {
            statement.setInt(2, 2);
            statement.setString(2, "user two");
            statement.setBoolean(3, false);

            int rowsAffected = statement.executeUpdate();
            System.out.println("Sucess! Rows affected: " + rowsAffected);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
