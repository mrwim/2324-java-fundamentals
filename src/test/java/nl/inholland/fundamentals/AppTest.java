package nl.inholland.fundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAppHasAGreeting() {
        App app = new App();
        Assertions.assertEquals("Hello World", app.printGreeting("World"));
    }
}
