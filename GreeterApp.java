import java.util.Scanner;

public class GreeterApp {
	
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Choose a greeting: ");
		String input1 = scnr.nextLine();
		System.out.print("Enter your name: ");
		String input2 = scnr.nextLine();
		System.out.print("How much volume would you like to add? (0-10): ");
		int input3 = scnr.nextInt();
		
		Greeter hello = new Greeter(input1);
		System.out.println(hello.greet(input2));
		
		JavaScriptGreeter simon = new JavaScriptGreeter(input1);
		System.out.println(simon.greet(input2));
		
		LoudGreeter loud = new LoudGreeter(input1);
		System.out.print(loud.greet(input2));
		for(int i = 1; i <= input3; i++) {
			System.out.print("!");}
			
		HtmlGreeter tag = new HtmlGreeter(input1);
		System.out.println('\n'+ tag.greet(input2));
		
		}
		
		
	}

