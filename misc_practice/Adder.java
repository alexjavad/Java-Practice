
public class Adder {
	
	static int result = 0;
	
	public static void main(String[] args) {
		for(String i : args) {
			int value = Integer.parseInt(i);
			result+=value;
		}
		System.out.println("The Sum of All Args is: " + String.valueOf(result));

	}

}
