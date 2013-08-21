public class UseArgument {

	public static void main(String[] args) {
		System.out.print("Hi, ");
		for (int i=0; i<args.length; i++) {
			if (i<args.length-1) {
			System.out.print(args[i] + " ");
			}
			else {
				System.out.print(args[i]);
			}
		}
		System.out.println(". How are you?");
	}

}