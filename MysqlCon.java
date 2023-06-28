import java.sql.*;
public class MysqlCon{
    public static void main(String[] args){
        try{
            Class.forName("com.mysqljdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mbproductions","mehak","mehak27003");
            System.out.println("Connection Established successfully");
        }catch(Exception e){System.out.println(e);}
    }
}