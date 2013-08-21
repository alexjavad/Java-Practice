import java.util.HashMap;


public class isUnique {
	public static void main(String[] args) {
		String arg1 = args[0];
		System.out.println(doTheWork(arg1));
	}
	
	public static boolean doTheWork(String s) {
		HashMap theMap = new HashMap();
		for(char sub : s.toCharArray()) {
			if(!theMap.containsKey(sub)) {
				theMap.put(sub,"");
			}
			else {
				return false;
			}
		}
		return true;
	}
}
