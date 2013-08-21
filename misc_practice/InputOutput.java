
import java.util.Scanner;

public class InputOutput {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Type some stuff, then press enter: ");
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			System.out.println("OMG THIS IS WHAT YOU WROTE: " + "\"" + input + "\"");
			System.out.print("Type some more stuff, then press enter: ");
		}
	}
}
