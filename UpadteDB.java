package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpadteDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String email,pass;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email");
		email=sc.next();
		System.out.println("enetr the updating password");
		pass=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
		
		PreparedStatement ps=con.prepareStatement("update register1 set pass=? where email=?");
		ps.setString(1, pass);
		ps.setString(2, email);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("data updated sucessfully");
		}
		
		
	}

}
