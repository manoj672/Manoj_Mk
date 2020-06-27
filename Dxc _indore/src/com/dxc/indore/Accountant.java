package com.dxc.indore;

import java.io.BufferedReader;
import java.sql.*;

public class Accountant {

	public void addstudent(BufferedReader buff) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root", "root");
		PreparedStatement stmtInsert = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)");
		System.out.println("enter the rollno");
		stmtInsert.setString(1, buff.readLine());
		System.out.println("enter the name");
		stmtInsert.setString(2, buff.readLine());
		System.out.println("enter the email");
		stmtInsert.setString(3, buff.readLine());
		System.out.println("enter the course");
		stmtInsert.setString(4, buff.readLine());
		System.out.println("enter the fee");
		stmtInsert.setString(5, buff.readLine());
		System.out.println("enter the paid");
		stmtInsert.setString(6, buff.readLine());
		System.out.println("enter the due");
		stmtInsert.setString(7, buff.readLine());
		System.out.println("enter the address");
		stmtInsert.setString(8, buff.readLine());
		System.out.println("enter the city");
		stmtInsert.setString(9, buff.readLine());
		System.out.println("enter the state");
		stmtInsert.setString(10, buff.readLine());
		System.out.println("enter the country");
		stmtInsert.setString(11, buff.readLine());
		System.out.println("enter the contactno");
		stmtInsert.setString(12, buff.readLine());

		System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
		
	}

	public void viewstudent(BufferedReader buff) throws Exception {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root", "root");
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)
			+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getString(12));
		con.close();
		
	}

	public void editstudent(BufferedReader buff) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root", "root");
		System.out.println("select what you want to edit from the following \n \n1 S_no \n2 Name \n3 Email \n4 Course \n5 Fee \n6 Paid \n7 Due \n8 Address \n9 City \n10 State \n11 Country \n12 Contact_No");
		String options = buff.readLine();
		switch (Integer.parseInt(options)) {
		case 1:
			System.out.println("This value is fixed !!");
			
	break;
        case 2:
        	System.out.println("Enter a new name\n");
        	String m2 = buff.readLine();
        	PreparedStatement stmtUpdate2 = con.prepareStatement("update student set Name=? where S_no=?");
        	stmtUpdate2.setString(1,m2); 
    		stmtUpdate2.setInt(2, 1);
    		System.out.println(stmtUpdate2.executeUpdate() +  " No of Records Updated");
	break;
        case 3:
        	System.out.println("Enter a new email\n");
        	String m3 = buff.readLine();
        	PreparedStatement stmtUpdate3 = con.prepareStatement("update student set Email=? where S_No=?");
        	stmtUpdate3.setInt(2, 1); 
    		stmtUpdate3.setString(1,m3);
    		System.out.println(stmtUpdate3.executeUpdate() +  " No of Records Updated");
	break;
        case 4:
        	System.out.println("Enter a new course\n");
        	String m4 = buff.readLine();
        	PreparedStatement stmtUpdate4 = con.prepareStatement("update student set Course=? where S_No=?");
        	stmtUpdate4.setInt(2, 1); 
    		stmtUpdate4.setString(1, m4);
    		System.out.println(stmtUpdate4.executeUpdate() +  " No of Records Updated");
	break;
        case 5:
        	System.out.println("Enter a new fee\n");
        	String m5 = buff.readLine();
        	PreparedStatement stmtUpdate5 = con.prepareStatement("update student set Fee=? where S_No=?");
        	stmtUpdate5.setInt(2, 1); 
    		stmtUpdate5.setString(1, m5);
    		System.out.println(stmtUpdate5.executeUpdate() +  " No of Records Updated");
	break;
        case 6:
        	System.out.println("Enter a new paid fee\n");
        	String m6 = buff.readLine();
        	PreparedStatement stmtUpdate6 = con.prepareStatement("update student set Paid=? where S_No=?");
        	stmtUpdate6.setInt(2, 1); 
    		stmtUpdate6.setString(1, m6);
    		System.out.println(stmtUpdate6.executeUpdate() +  " No of Records Updated");
	break;
        case 7:
        	System.out.println("Enter a new Due\n");
        	String m7 = buff.readLine();
        	PreparedStatement stmtUpdate7 = con.prepareStatement("update student set Due=? where S_No=?");
        	stmtUpdate7.setInt(2, 1); 
    		stmtUpdate7.setString(1, m7);
    		System.out.println(stmtUpdate7.executeUpdate() +  " No of Records Updated");
	break;
        case 8:
        	System.out.println("Enter a new Address\n");
        	String m8 = buff.readLine();
        	PreparedStatement stmtUpdate8 = con.prepareStatement("update student set Address=? where S_No=?");
        	stmtUpdate8.setInt(2, 1); 
    		stmtUpdate8.setString(1, m8);
    		System.out.println(stmtUpdate8.executeUpdate() +  " No of Records Updated");
	break;
        case 9:
        	System.out.println("Enter a new city\n");
        	String m9 = buff.readLine();
        	PreparedStatement stmtUpdate9 = con.prepareStatement("update student set City=? where S_No=?");
        	stmtUpdate9.setInt(2, 1); 
    		stmtUpdate9.setString(1, m9);
    		System.out.println(stmtUpdate9.executeUpdate() +  " No of Records Updated");
    break;
        case 10:
        	System.out.println("Enter a new state\n");
        	String m10 = buff.readLine();
        	PreparedStatement stmtUpdate10 = con.prepareStatement("update student set state=? where S_No=?");
        	stmtUpdate10.setInt(2, 1); 
    		stmtUpdate10.setString(1, m10);
    		System.out.println(stmtUpdate10.executeUpdate() +  " No of Records Updated");
    break;
        case 11:
        	System.out.println("Enter a new country\n");
        	String m11 = buff.readLine();
        	PreparedStatement stmtUpdate11 = con.prepareStatement("update student set Country=? where S_No=?");
        	stmtUpdate11.setInt(2, 1); 
    		stmtUpdate11.setString(1, m11);
    		System.out.println(stmtUpdate11.executeUpdate() +  " No of Records Updated");
    break;
        case 12:
        	System.out.println("Enter a new contact number\n");
        	String m12 = buff.readLine();
        	PreparedStatement stmtUpdate12 = con.prepareStatement("update student set Contact_No=? where S_No=?");
        	stmtUpdate12.setInt(2, 1); 
    		stmtUpdate12.setString(1, m12);
    		System.out.println(stmtUpdate12.executeUpdate() +  " No of Records Updated");
    break;
			

		default:System.out.println("no option selected");
			break;
		}

	}

	public void due(BufferedReader buff) throws Exception {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select student_due from student");
		while(rs.next())
			System.out.println(rs.getString(6));
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

