package demo;

//import JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display {
	public static void main(String[] args) throws SQLException{
		//String url="jdbc:mysql://localhost:3306/university";
		String uname="root";
		String password="tiger";
		String query="select * from register1";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo1","root","");
			Statement statement=con.createStatement();
			ResultSet result=statement.executeQuery(query);
			
			while(result.next()) {
				String UniversityData="";
				for(int i=1;i<=5;i++) {
					UniversityData+=result.getString(i)+":";
				}
				System.out.println(UniversityData);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
