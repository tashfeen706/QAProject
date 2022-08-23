package com.qa.ims;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CRUDQueries query = new CRUDQueries();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bookName:");
		String bookName=sc.nextLine();
		System.out.println("Enter author:");
		String author=sc.nextLine();
		System.out.println("Enter genre:");
		String genre=sc.nextLine();
		
		
		
		query.create(bookName, author, genre);
		
		
		query.closeConn();
		
		
		
		
	

		
		

	}

}
