

//aaaabbcccaeeeee => a4b2c3ae5
//resultString = ""
//have curr character of string & store it
//have a count for curr character = 1
//increment currCOunt only if nextCharacter is equal to currCharacter
//else: i.e. if currCharacter not equal nextCharacter
	//rsultString += currCharacter + currCount;
	//currCharacter = nextCharacter
	//currCount = 1
	

public class DataCompression {	

	public static void main(String[] args) {
		String theString = args[0];
		System.out.println(compressString(theString));
	}

	public static String compressString(String theString) {
		String resultString = "";
		char currChar;
		char nextChar;
		int currCount = 1;
		for(int i=0; i<theString.length();i++) {
			currChar = theString.charAt(i);
			if(i==theString.length()-1) {
				resultString+=String.valueOf(currChar) + String.valueOf(currCount);
				return resultString;
			}
			
			nextChar = theString.charAt(i+1);
			if(String.valueOf(currChar).equals(String.valueOf(nextChar))) {	
				currCount+=1;	
			}
			else {
			resultString += String.valueOf(currChar) + String.valueOf(currCount);
			currCount = 1;
			}
		}
		return resultString;		
	}
}