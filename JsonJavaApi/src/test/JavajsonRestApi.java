package test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import java.util.List;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/jason")
public class JavajsonRestApi {

	private Booklist  bookList = new Booklist();
	
	@POST
	@Path("/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Book postJson(Book book) {
		bookList.addBook(book);
		return book;
	}
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getJson() {
		return bookList.getAllBooks();
	}
	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
    public int sayHelloJSON(@QueryParam("x") int x,@QueryParam("y") int y) throws IllegalArgumentException {
		
		if(x==(int)x && y==(int)y) {
		int resource = (x+y);
		return resource;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}
