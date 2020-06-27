package com.dxc.indore;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.*;

public class Admin {

	public void login(BufferedReader buff) throws Exception {

		System.out.println("Enter the UserName");
		String username=buff.readLine();
		System.out.println("Enter your password");
		String password=buff.readLine();
		System.out.println("admin login successful\n");
		
	}

	public void addAccountant(BufferedReader buff) throws  Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db", "root", "root");
		
		PreparedStatement stmtInsert = con.prepareStatement("insert into accountant values(?,?,?,?,?)");
		System.out.println("Enter the id");
		stmtInsert.setString(1, buff.readLine());
		System.out.println("Enter the name");
		stmtInsert.setString(2, buff.readLine());
		System.out.println("Enter the password");
		stmtInsert.setString(3, buff.readLine());
		System.out.println("Enter the email");
		stmtInsert.setString(4, buff.readLine());
		System.out.println("Enter the Contactno");
		stmtInsert.setString(5, buff.readLine());

		System.out.println(stmtInsert.executeUpdate() + " No.of Records Inserted");

		
	}

	public void viewAccountant(BufferedReader buff) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db", "root", "root");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from accountant");
		while(rs.next())
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4));
		con.close();
	}

	public void logout(BufferedReader buff) throws Exception {

		String continueChoice;
		boolean transaction=true;
		System.out.println("Do you Want to logout\nlogout \nNo");
		continueChoice =buff.readLine();
		if(continueChoice.equalsIgnoreCase("logout"))
			transaction=false;
			
		
	}
	

}

