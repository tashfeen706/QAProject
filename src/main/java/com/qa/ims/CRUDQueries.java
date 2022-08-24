package com.qa.ims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDQueries {
	
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
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
	
			
	
	public void create(Books book) {
		
		//String bookName ="The Hobbit";
		//String author = "JR Tolkien";
		//String genre ="Magic";
				
		String createStmt = "INSERT INTO books(Book_Name,Author,Genre)VALUES('"+book.getAuthor()+"','"+book.getAuthor()+"','"+book.getGenre()+"');";
		try {
			stmt.executeUpdate(createStmt);
			System.out.println("Create statement executed");
		}catch(SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}
	
	
		public void read(){
			
			String readStmt = "SELECT * FROM books;";
			try {
				rs = stmt.executeQuery(readStmt);
				while (rs.next()) {
					System.out.println("ID: " + rs.getInt("id"));
					System.out.println("Book Name: " + rs.getString("Book_Name"));
					System.out.println("Author: " + rs.getInt("Author"));
					System.out.println("Genre: " + rs.getString("Genre"));
					
				}
		
			} catch (SQLException e) {
				System.out.println("Bad query");
				e.printStackTrace();
			}
		}
	
		public void update(int id, String updateVal){
			//UPDATE books SET Book_Name = "The Hobbit" WHERE id =2;
			String updateStmt = "UPDATE  SET bookName = '" + updateVal + "' WHERE id = " + id + ";";
			try {
				stmt.executeUpdate(updateStmt);
				System.out.println("Update statement executed");
				
			}catch (SQLException e) {
				System.out.println("Bad query");
				e.printStackTrace();
			}

		}
	
		
		
			
			public void delete(int id) {
				String delStmt = "DELETE FROM books WHERE id=" + id + ";";
				try {
					stmt.executeUpdate(delStmt);
					System.out.println("Delete statement executed");
				} catch (SQLException e) {
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
