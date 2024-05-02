package cts.JDBCCTSMAVEN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class App 
{
    public static void main( String[] args )throws Exception
    {
        String url="jdbc:mysql://localhost:3306/cts";
        Connection con=DriverManager.getConnection(url, "root", "root");
        Statement st=con.createStatement();
        int i=st.executeUpdate("insert into dilip values('Nikhil','Sharma')");
        if (i>0)
        {
        	System.out.println("Success");	
        }
    }
}
