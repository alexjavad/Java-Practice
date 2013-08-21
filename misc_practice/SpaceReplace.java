
public class SpaceReplace {

	static myQueue q = new myQueue();

	//Given a String as input, output a String with all spaces replaced with '%20' instead
	public static void main(String[] args) {
		String input = new String("a j  ");
		char[] inputCharArray = input.toCharArray();
		char[] result = replaceSpaces(inputCharArray, 5);
		for(int i=0;i<result.length;i++) {
			System.out.println("This is the char at index " + String.valueOf(i) + ": " + String.valueOf(result[i]));

		}
		
		/*
		for(int i=0;i<transInput.length;i++) {
			if(String.valueOf(transInput[i]).equals(" ")) {
				transInput[i]='%';
				char next1 = transInput[i+1];
				char next2 = transInput[i+2];
			}
			System.out.println("This is the char at index " + String.valueOf(i) + ": " + String.valueOf(transInput[i]));
		}*/

	}
	
	public static char[] replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for (i=0; i<length;i++) {
			if(str[i]==' ') {
				spaceCount++;
			}
		}
		newLength=length+spaceCount*2;
		for(i=length-1;i>=0;i++) {
			if(str[i]==' ') {
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength-=3;
			} else {
				str[newLength-1]=str[i];
				newLength--;
			}
		}
		return str;
	}
/*
	public static char[] shove(char[] orig, int trueLength, int shoveBy) {
		int lastIndex = trueLength-1;
		for(int i=0; i<trueLength;i++) {
			if((i+shoveBy)<=lastIndex) {
				char shoveThis = orig[i];
				orig[i]=' ';
				q.enqueue(orig[i+shoveBy]);
				orig[i+shoveBy]=shoveThis;
			}
			
		}
		return orig;
	}
	*/

}
