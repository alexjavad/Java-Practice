
import java.util.Scanner;

public class Fib {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter nth Fib number to print up to: ");
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		//int n = Integer.parseInt(args[0]);
		for(int i=0; i<=n; i++) {
			long start = System.currentTimeMillis();
			System.out.println("Fib" + i + ": " + fib(i));
			long end = System.currentTimeMillis();
			long durationSeconds = (end - start)/1000;
			long durationMillis = (end - start)%1000;
			}
	}

	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {			
			return fib(n-2) + fib(n-1);
			
		}
	}
}
