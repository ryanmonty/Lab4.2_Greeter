import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoudGreeterTest {

	@Test
	void testLouder1() {
		LoudGreeter loud = new LoudGreeter("Yo");
		assertEquals("Yo, Johnny!!!", loud.greet("Johnny"));
	}
	
	@Test
	void testLouder2() {
		LoudGreeter loud = new LoudGreeter("Yo");
		assertEquals("Yo, Johnny!!!!!!", loud.greet("Johnny", 3));
	}
	
	@Test
	void testLouder3() {
		LoudGreeter loud = new LoudGreeter("Yo");
		assertEquals("Yo, Johnny!!!!!!!!!!", loud.greet("Johnny", 7));
	}

}
