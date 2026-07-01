import java.sql.DriverManager;

public class Delete {
    public static void main(String[] args){
    String url = "jdbc:sqlite:jdbc.db";
    String query = "DELETE FROM user WHERE id = ?";

        try (
                var connection = DriverManager.getConnection(url);
                var statement = connection.prepareStatement(query);
        ){
            var userId = 4;

            statement.setInt(1, userId);

            statement.executeUpdate();

            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
