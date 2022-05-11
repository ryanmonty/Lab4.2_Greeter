import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testGreeter1() {
		Greeter hello = new Greeter("Howdy");
		assertEquals("Howdy, Lois!", hello.greet("Lois"));
	}
	@Test
	void testGreeter2() {
		Greeter hello = new Greeter("Fudge off");
		assertEquals("Fudge off, Clyde!", hello.greet("Clyde"));
	}

}
