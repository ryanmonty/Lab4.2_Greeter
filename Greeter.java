
public class Greeter {

		public String greeting;
		
		public String getGreeting() {
			return greeting;
		}
		
		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}
		
		public Greeter() {
			
		}
		
		public Greeter(String greeting) {
			setGreeting(greeting);
		}
		
		public String greet(String name) {
			String newGreeting = greeting + ", " + name + "!";
			return newGreeting;
			
		}
}
