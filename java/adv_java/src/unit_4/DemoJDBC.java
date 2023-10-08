package unit_4;
import java.sql.*; //for jdbc

public class DemoJDBC {
    public static void main(String[] args) {
        //step 1: initialize JDBC driver on java application
        //it wll throw class not found exception if driver class is missing
        try{
            Connection conn;
            Class.forName("  ");

            //Step 2 : Connect to database using DriverMAnager.getConnection()
            conn = DriverManager.getConnection("jdbc:mysql:localhost:3306/prime", "root", "" )
                                                //protocol    : servername:port/db
            //Step 3 : Use statement object to check and execute query
            Statement st = conn.createStatement();
            if(conn!= null){
                System.out.println("Server Connected");
            }
            else{
                System.out.println("Server not connected");
            }
        }catch (ClassNotFoundException c){
            System.out.println(c);
        }catch (SQLException s){
            System.out.println(s);
        }
    }
}
