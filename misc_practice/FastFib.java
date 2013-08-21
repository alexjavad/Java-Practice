
import java.util.Scanner;

public class FastFib {

	private static Scanner scanner = new Scanner(System.in);
	static long[] fibArray;

	public static void main(String[] args) {
		System.out.print("Enter nth Fib number to print up to: ");
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		//int n = Integer.parseInt(args[0]);
		fibArray = new long[n+1];
		for(long i=0; i<=n; i++) {
			if(i==0 || i==1) {
				fibArray[(int) i]=i;
			}
			else {
				fibArray[(int) i]=fibArray[(int) i-1]+fibArray[(int) i-2];
			}
			System.out.println("FastFib" + i + ": " + String.valueOf(fibArray[(int) i]));
		}
	}
}
