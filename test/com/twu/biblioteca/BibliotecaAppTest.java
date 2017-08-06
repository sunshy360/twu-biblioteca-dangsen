package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    public BibliotecaApp bibliotecaAppObj = new BibliotecaApp();

    @Before
    public void beforeThings(){
        bibliotecaAppObj.initBookInfo();
        bibliotecaAppObj.initMovieInfo();
        bibliotecaAppObj.initUserInfo();
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
    public void getAllMoviesListTest() {
        assertEquals("Titanic\nInception\n", bibliotecaAppObj.getAllMoviesList());
    }

    @Test
    public void getMovieDetailTest() {
        assertEquals("Titanic\n1998\nCameron\n9\ntrue\n", bibliotecaAppObj.getMovieDetail("Titanic"));
        assertEquals("Inception\n2010\nNolan\n9\ntrue\n", bibliotecaAppObj.getMovieDetail("Inception"));
    }

    @Test
    public void checkoutMovieMessageTest() {
        assertEquals("Thank you! Enjoy the movie\n", bibliotecaAppObj.checkoutMovie("Titanic"));
        assertEquals("That movie is not available\n", bibliotecaAppObj.checkoutMovie("Titanic"));
        assertEquals("That movie is not available\n", bibliotecaAppObj.checkoutMovie("Avatar"));
    }

    @Test
    public void checkoutMovieStatusTest() {
        bibliotecaAppObj.checkoutMovie("Titanic");
        assertEquals(false, bibliotecaAppObj.getMovieStatus("Titanic"));
    }
    @Test
    public void returnMovieMessageTest() {
        bibliotecaAppObj.checkoutMovie("Titanic");
        assertEquals("Thank you for returning the movie\n", bibliotecaAppObj.returnMovie("Titanic"));
        assertEquals("That is not a valid movie to return\n", bibliotecaAppObj.returnMovie("Titanic"));
        assertEquals("That is not a valid movie to return\n", bibliotecaAppObj.returnMovie("Avatar"));
    }

    @Test
    public void returnMovieStatusTest() {
        bibliotecaAppObj.checkoutMovie("Titanic");
        bibliotecaAppObj.returnMovie("Titanic");
        assertEquals(true, bibliotecaAppObj.getMovieStatus("Titanic"));
    }
    @Test
    public void test() {
        assertEquals(1, 1);
    }
}
