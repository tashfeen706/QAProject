package com.qa.ims;

import java.awt.print.Book;
import java.util.Scanner;

public class Choice {
	
	private static Scanner sc = new Scanner(System.in);
	
	

	public String getInput() {
		System.out.println("Enter CRUD choice: ");
		return sc.nextLine();
	}

	public void options() {
		
		CRUDQueries q = new CRUDQueries();

		

		String crud = getInput();

		
		try {
			
			
			do {
				
				switch (crud.toLowerCase()) {
				case "create":
					System.out.println("Enter bookName:");
					String bookName=sc.nextLine();
					System.out.println("Enter author:");
					String author=sc.nextLine();
					System.out.println("Enter genre:");
					String genre=sc.nextLine();
					q.create(new Books(bookName, author, genre));
					break;
				case "read":
					q.read();
					break;
				case "update":
					System.out.println("Enter id of record to update: ");
					int uid = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the new genre of the book: ");
					String nModel = sc.nextLine();
					q.update(uid, nModel);					
					break;
				case "delete":
					System.out.println("Enter id of record to delete: ");
					int id = sc.nextInt();
					sc.nextLine();//capture enter key
					q.delete(id);
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				// check if user wants to continue or break out of the loop
				System.out.println("Would you like to continue? (y/n)");
				String quit = sc.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			q.closeConn();
		}
	}

}


