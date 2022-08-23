package com.qa.ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDQueries {
	
	
	private Connection conn;
	private Statement stmt;
	
	public CRUDQueries() { 
		try {
			
			conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASS);
			this.stmt = conn.createStatement();
			System.out.println("Connection Successful!");
		}catch(SQLException e) {
			System.out.println("Incorrect credentials");
			e.printStackTrace();
			
		} 
		
	}
	
			
	
	public void create(String bookName,String author, String genre) {
		
		//String bookName ="The Hobbit";
		//String author = "JR Tolkien";
		//String genre ="Magic";
				
		String createStmt = "INSERT INTO books(Book_Name,Author,Genre)VALUES('"+bookName+"','"+author+"','"+genre+"');";
		try {
			stmt.executeUpdate(createStmt);
			System.out.println("Create statement executed");
		}catch(SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}
	
	
	public void closeConn() {
		try {
			conn.close();
			System.out.println("Closed!");
			
		}catch(SQLException e) {
			System.out.println("Closing connection");
			e.printStackTrace();
		}
	}

}
