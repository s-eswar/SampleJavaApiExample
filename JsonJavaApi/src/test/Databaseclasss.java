package test;

import java.util.HashMap;
import java.util.Map;

public class Databaseclasss {
	
	private static Map<Long, Book> books= new HashMap<>();

	public static Map<Long, Book> getBooks(){
		return books;
	}
}
