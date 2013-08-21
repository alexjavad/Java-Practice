
public class FPAdder {

	static float result = 0;

	public static void main(String[] args) {
		for(String f : args) {
			float value = Float.parseFloat(f);
			result+=value;
		}
		System.out.printf("The Sum of All Floats is: %.2f", result);
	}

}
