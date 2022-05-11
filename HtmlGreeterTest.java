import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlGreeterTest {

	@Test
	void testJava1() {
		HtmlGreeter tag = new HtmlGreeter("Hi");
		assertEquals("<h1>Hi, John!<h1>", tag.greet("John"));
	}
	@Test
	void testJava2() {
		HtmlGreeter tag = new HtmlGreeter("Hi", "meow");
		assertEquals("<meow>Hi, John!<meow>", tag.greet("John"));
	}

}
