import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList <Book> books;
	double totalValue;

	public void createCart() {
		// TODO Auto-generated method stub
		books = new ArrayList <Book> ();
		totalValue = 0;
	}
	
	public void addBook(Book book) {
		books.add(book);
		totalValue += book.getPrice();
	}
	
	public void removeBook(Book book) {
		books.remove(book);
		totalValue -= book.getPrice();
	}
	

}
