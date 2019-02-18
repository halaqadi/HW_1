import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class ShoppingCartTest {
	
	@Test
	public void firstTest() {
		ShoppingCart cart = new ShoppingCart();
		cart.createCart();
		assertTrue(cart.books.size()==0);
	}
	
	@Test
	public void secondTest() {
		ShoppingCart cart = new ShoppingCart();
		cart.createCart();
		Book book = new Book();
		book.setName("Java Book");
		book.setPrice(127);
		cart.addBook(book);
		assertTrue(cart.books.size()==1);
		assertTrue(cart.totalValue==127);	
		
	}
	
	@Test
	public void thirdTest() {
		//Do it in a Before??-----------------------------
		ShoppingCart cart = new ShoppingCart();
		cart.createCart();
		Book book1 = new Book();
		book1.setName("Java Book");
		book1.setPrice(127);
		cart.addBook(book1);
		Book book2 = new Book();
		book2.setName("Web Design Book");
		book2.setPrice(100);
		cart.addBook(book2);
		assertTrue(cart.books.size()==2);
		assertTrue(cart.totalValue==227);	
	}

}
