import java.sql.DriverManager;

public class Update {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:jdbc.db";

        String query = "UPDATE user SET name = ?, is_admin = ? WHERE id = ?;";

        try (
                var connection = DriverManager.getConnection(url);
                var statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, "New Name");
            statement.setBoolean(2, false);
            statement.setInt(3, 1);

            statement.executeUpdate();
            System.out.println("Sucess!");
        } catch (Exception e) {
            System.out.println("Error + " + e.getMessage());
        }
    }

}
