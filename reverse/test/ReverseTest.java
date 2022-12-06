package reverse.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static reverse.src.Reverse.reverse;

class ReverseTest {
    @Test
    void testHelloWorld(){
        assertEquals("olleH dlroW", reverse("Hello World"));
    }

    @Test
    void testEmptyText(){
        assertEquals("", reverse(""));
    }

    @Test
    void testOneSymbol(){
        assertEquals("a", reverse("a"));
    }

    @Test
    void testTwoLetters(){
        assertEquals("a b", reverse("a b"));
    }

    @Test
    void testHelloMyWorld(){
        assertEquals("olleH yM dlroW", reverse("Hello My World"));
    }
}