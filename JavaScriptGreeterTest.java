import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaScriptGreeterTest {

	@Test
	void testJava1() {
		JavaScriptGreeter simon = new JavaScriptGreeter("Howdy");
		assertEquals("Simon says, Howdy, Lois!", simon.greet("Lois"));
	}
	@Test
	void testJava2() {
		JavaScriptGreeter simon = new JavaScriptGreeter("Sup");
		assertEquals("Simon says, Sup, Foo!", simon.greet("Foo"));
	}

}
