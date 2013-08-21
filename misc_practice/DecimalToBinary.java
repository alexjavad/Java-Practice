import java.util.Scanner;


public class DecimalToBinary {

	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.print("Type decimal number to convert to binary: ");
		String input = scanner.nextLine();
		long decimalNumber = Long.parseLong(input);
		System.out.println();
		System.out.println(decToBin(decimalNumber));		
	}
	
	public static String decToBin(long d) {
		String resultBinary = "";
		if(d<=0) {
			return resultBinary;
		}
		else {
			long remainder = d%2;
			resultBinary+=String.valueOf(remainder);
			decToBin(d/2);
		}
		return resultBinary;
	}

}

