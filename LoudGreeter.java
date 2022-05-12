
public class LoudGreeter extends Greeter{
	private String extra = "!!";
	
	public String getExtra() {
		return extra;
	}
	
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	
	public LoudGreeter() {
		
	}
	
	public LoudGreeter(String greeting) {
		setGreeting(greeting);
	}
	
	public void addVolume() {
		String noise = "!";
		
		this.extra = extra + noise;
	}
	
	public String greet(String name) {
		
		String newGreeting = greeting + ", " + name + "!" + getExtra() ;
		
		return newGreeting;
	}
	
	public String greet(String name, int input3) {
		for(int i = 1; i <= input3; i++) {
			addVolume();}
		
		String newGreeting = greeting + ", " + name + "!" + getExtra() ;
		
		return newGreeting;
	}
}
