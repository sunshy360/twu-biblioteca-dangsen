package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    public BibliotecaApp bibliotecaAppObj = new BibliotecaApp();

    @Before
    public void beforeThings(){
        bibliotecaAppObj.initBookInfo();
    }

    @Test
    public void getAllBooksListTest() {
        assertEquals("Math\nChemical\nComputer\n", bibliotecaAppObj.getAllBooksList());
    }

    @Test
    public void getBookDetailTest() {
        assertEquals("Math\nJohn\nA\n", bibliotecaAppObj.getBookDetail("Math"));
        assertEquals("Chemical\nMike\nB\n", bibliotecaAppObj.getBookDetail("Chemical"));
    }

    @Test
    public void checkoutBookMessageTest() {
        assertEquals("Thank you! Enjoy the book\n", bibliotecaAppObj.checkoutBook("Math"));
        assertEquals("That book is not available\n", bibliotecaAppObj.checkoutBook("Math"));
        assertEquals("That book is not available\n", bibliotecaAppObj.checkoutBook("English"));
    }

    @Test
    public void checkoutBookStatusTest() {
        bibliotecaAppObj.checkoutBook("Math");
        assertEquals(false, bibliotecaAppObj.getBookStatus("Math"));
    }
    @Test
    public void returnBookMessageTest() {
        bibliotecaAppObj.checkoutBook("Math");
        assertEquals("Thank you for returning the book\n", bibliotecaAppObj.returnBook("Math"));
        assertEquals("That is not a valid book to return\n", bibliotecaAppObj.returnBook("Math"));
        assertEquals("That is not a valid book to return\n", bibliotecaAppObj.returnBook("English"));
    }

    @Test
    public void returnBookStatusTest() {
        bibliotecaAppObj.checkoutBook("Math");
        bibliotecaAppObj.returnBook("Math");
        assertEquals(true, bibliotecaAppObj.getBookStatus("Math"));
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }
}
