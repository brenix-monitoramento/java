import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Main {
    public static void connect(){
        String databaseUrl = "jdbc:sqlite:C:/Users/DTF-SEFAZ/development/repos/java/estudos-java/jdbc/src/config/database.db";

        try{
            Connection connection = DriverManager.getConnection(databaseUrl);
             System.out.println("Connection to database has been established.");

             connection.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        connect();
    }
}
