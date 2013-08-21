
public class Palindrome {

	public static void main(String[] args) {
		String p = args[0];
		System.out.println(isPalindrome(p));
	}

	public static boolean isPalindrome(String p) {
		
		//TODO: AInt workin... seems like the double for loop approach is off.. how to get the index computation/stopping point correct
		boolean result = true;
		int pLength = p.length();

		//if even
		//Ex: abba
		
		if(pLength%2==0) {
			for(int headPointer=0; headPointer<pLength/2; headPointer++) {
				for(int tailPointer=pLength-1; tailPointer>(pLength/2)-1; tailPointer--) {
					System.out.println("headPointer at index" + headPointer + " is: " + String.valueOf(p.charAt(headPointer)));
					System.out.println("tailPointer at index" + tailPointer + " is: " + String.valueOf(p.charAt(tailPointer)));

					if(!String.valueOf(p.charAt(headPointer)).equals(String.valueOf(p.charAt(tailPointer)))) {
						return false;
					}
				}
			}
		}
		
		//if odd
		//Ex: ababa
		if(pLength%2==1) {
			for(int headPointer=0; headPointer<Math.floor(pLength/2); headPointer++) {
				for(int tailPointer=pLength-1; tailPointer>Math.floor(pLength/2); tailPointer--) {
					if(!String.valueOf(p.charAt(headPointer)).equals(String.valueOf(p.charAt(tailPointer)))) {
						return false;
					}
				}
			}
		}
		return result;
	}

}
