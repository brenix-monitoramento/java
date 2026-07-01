import java.sql.DriverManager;

public class Select {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:jdbc.db";

        String query = "SELECT * FROM user";

        try (
                var connection = DriverManager.getConnection(url);
                var statement = connection.createStatement().executeQuery(query);
        ) {
            while (statement.next()) {
                System.out.println(" | " + statement.getInt("id"));
                System.out.println(statement.getString("name"));
                System.out.println(statement.getBoolean("is_admin") + " | ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public static void where() {
        String url = "jdbc:sqlite:jdbc.db";
        var userId = 4;
        String query = "SELECT * FROM user WHERE id = ?";

        try (
                var connection = DriverManager.getConnection(url);
                var statement = connection.prepareStatement(query);
        ) {

            statement.setDouble(1, userId);

            var result = statement.executeQuery();

            while (result.next()) {
                System.out.println(" | " + result.getInt("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getBoolean("is_admin") + " | ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
