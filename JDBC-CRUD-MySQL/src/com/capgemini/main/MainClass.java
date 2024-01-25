package com.capgemini.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {  
//	here 'class' is a user defined datatype

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = null; 
		
		//Here Connection is an iterface and con is an obj but not of this 
//		interface as it doesnot have an obj, as it has abstract methods in it
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Here the Class is the interface
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims", "", "");
		System.out.println("Connection Established");
		
		System.out.println(con.getClass().getName());
		//Thus con is an object of jdbc class -> ConnectionImpl method's
	}
}
