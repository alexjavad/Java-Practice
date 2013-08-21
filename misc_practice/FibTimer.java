
public class FibTimer {

	static FastFib fastFib = new FastFib();
	static Fib fib = new Fib();
	
	//TODO: Fix this Problem: 
	//		Possible Solution #1: 
	
	public static void main(String[] args) {
		long fastFibStartTime = System.currentTimeMillis();
		String[] input1 = new String[1];
		input1[0]= String.valueOf(43);
		fastFib.main(input1);
		long fastFibEndTime = System.currentTimeMillis();
		long fastFibDurationMillis= (fastFibEndTime - fastFibStartTime);
		
		long fibStartTime = System.currentTimeMillis();
		String[] input2 = new String[1];
		input2[0]= String.valueOf(43);
		fib.main(input2);
		long fibEndTime = System.currentTimeMillis();
		long fibDurationMillis = (fibEndTime - fibStartTime);
		System.out.println();
		System.out.println("fastFibDuration (in millis): " + String.valueOf(fastFibDurationMillis));
		System.out.println("fibDuration (in millis): " + String.valueOf(fibDurationMillis));

	}

}
