package demo;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.tomcat.util.buf.StringCache;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deleteDB{
	public static void main(String[] args) { 
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username need to delete");
        name=sc.next();
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
    		
    		PreparedStatement ps1=con.prepareStatement("delete from register1 where name=?");
    		ps1.setString(1, name);
    		int j=ps1.executeUpdate();
    		if(j>0) {
    			System.out.println("record delete succesfully");
    		}
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
	
	}

}
