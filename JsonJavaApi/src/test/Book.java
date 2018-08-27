package test;

public class Book {
	
	public String author;
	public String name;
	public int id;
	
	public Book(String author, String name,int id) {
		super();
		this.author=author;
		this.name=name;
		this.id=id;
	}
	public String getAuthor() {
	return author;
	}

	public void setAuthor(String author) {
	this.author = author;
	}

	public String getName() {
	return name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Book() {
		super();
	}

}
