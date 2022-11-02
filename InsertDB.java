package demo;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.tomcat.util.buf.StringCache;

public class InsertDB {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String name,email,phone,pass,cpass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		name=sc.next();
		System.out.println("Enter email");
		email=sc.next();
		System.out.println("Enter Phone number");
		phone=sc.next();
		System.out.println("Enter password");
		pass=sc.next();
		System.out.println("confirm password");
		cpass=sc.next();
		
		
		try {
		// add driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
		//query
		PreparedStatement ps=con.prepareStatement("insert into register1 values(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setString(4,pass);
		ps.setString(5,cpass);
		//execute query
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("data updated sucessfully");
		}
				
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
