
public class HtmlGreeter extends Greeter{
	public String tagName;
	
	public HtmlGreeter(String greeting) {
		setGreeting(greeting);
		this.tagName = "h1";
	}
	
	public HtmlGreeter(String greeting, String tagName) {
		setGreeting(greeting);
		this.tagName = tagName;
	}
	
	public String greet(String name) {
		String newGreeting = "<"+tagName+">" + greeting + ", " + name + "!" + "<"+ tagName+">";
		return newGreeting;
	}
}
