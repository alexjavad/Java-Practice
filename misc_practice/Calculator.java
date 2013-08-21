
import java.util.Scanner;

public class Calculator {
	
	private static Scanner scanner = new Scanner(System.in);
	
	//What will my inputs to the calculator look like?
	//(1+1) or (1 +    1) trim whitespace/no blank characters!
	//Focus on well-formed input for now
	//1+2*3+(4*(3+2))
	//Implement P/E/MD/AS
	
	public static void main(String[] args) {
		System.out.print("Type some math stuff, then press enter: ");
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			//Probably need to processCommand to return the String result and print it
			System.out.println("input: " + input);
			System.out.println("output: " + processCommand(input));
			System.out.print("Type some more math stuff, then press enter: ");
		}
	} //end main method
	
	public static String processCommand(String comm) {
		String result = "";
		
		//no input
		if(comm.equals("")) {
			return comm; // just want the blank string
		}
		else if(comm.length()==1) {
			return comm;
		}
		else if(comm.matches(".*[0-9]+.*[0-9]")) {
			return processOperation(comm);
		}
		return result;
	}
	
	public static String processOperation(String comm) {
		int result = 0;
		if(comm.matches(".*[0-9]+.*[0-9]")) {
		//if(String.valueOf(comm.charAt(1)).equals("+")) {
			int arg1 = Integer.parseInt(String.valueOf(comm.charAt(0)));
			int arg2 = Integer.parseInt(String.valueOf(comm.charAt(2)));
			result = arg1+arg2;
		}
		return String.valueOf(result);
	}
	
} // end Calculator class
