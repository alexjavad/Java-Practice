import java.util.*;


public class Generics {
	static class NaturalNumber {
	    private int i;

	    public NaturalNumber(int i) { this.i = i; }
	}
	static class EvenNumber extends NaturalNumber {
		public EvenNumber(int i) { 
			super(i);
		}
	}
	public static void main(String[] args) {
		Collection<NaturalNumber> list = new ArrayList<NaturalNumber>();
		list.add(new EvenNumber(2));
	}

}
