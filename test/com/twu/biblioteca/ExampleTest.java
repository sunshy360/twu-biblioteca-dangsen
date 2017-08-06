package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    public BibliotecaApp bibliotecaAppObj = new BibliotecaApp();

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
    public void test() {
        assertEquals(1, 1);
    }
}
