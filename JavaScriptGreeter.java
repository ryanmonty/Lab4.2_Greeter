
public class JavaScriptGreeter extends Greeter {

	public JavaScriptGreeter() {
		
	}
	
	public JavaScriptGreeter(String greeting) {
		setGreeting(greeting);
	}
	
	public String greet(String name) {
		String newGreeting = "Simon says, " + greeting + ", " + name + "!";
		return newGreeting;
	}
}
