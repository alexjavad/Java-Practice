
public class RecursionExample {
	public static void main(String[] args) {
		String theString = args[0];
		String length = args[1];
		System.out.println(doReverse(theString, Integer.valueOf(length)));
	}

	private static String doReverse(String str, int length) {
		if(length==0) {
			return str;
		}
		else {
			return str.charAt(length-1) + doReverse(str.substring(0, length-1), length-1);
		}		
	}
}
