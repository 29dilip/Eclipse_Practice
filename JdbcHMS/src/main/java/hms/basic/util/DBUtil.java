package hms.basic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
public static Connection getConnection()
{
 String url="jdbc:mysql://localhost:3306/hms3";
 String username="root";
 String password="root";
 Connection con=null;
 try {
 con= DriverManager.getConnection(url,username,password);
 } catch (SQLException e) {

 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 return con;
}

}


