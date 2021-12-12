import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {
    @Test
    public void should_say_hello() {
        Greeter greeter = new Greeter("John Doe");

        String greeting = greeter.sayHello();

        assertEquals("Hello, John Doe!", greeting);
    }
}
