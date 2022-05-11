
public class LoudGreeter extends Greeter{
	private String extra = "!!";
	
	
	public LoudGreeter() {
		
	}
	
	public LoudGreeter(String greeting) {
		setGreeting(greeting);
	}
	
	public String greet(String name) {
		String newGreeting = greeting + ", " + name + "!" + extra;
		return newGreeting;
	}
}
