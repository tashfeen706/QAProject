package com.qa.ims;

public class Books {
	
	private int id;
	private String bookName;
	private String author;
	private String genre;
	

	public  Books() {
		super();
	}

	public Books(int id, String bookName, String author, String genre) {
		super();
		this.id = id;
		this.author = author;
		this.bookName = bookName;
		this.genre = genre;
		
	}

	public Books(String bookName, String author, String genre) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	

	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", author=" + author + ", genre=" + genre"]";
	}

}


