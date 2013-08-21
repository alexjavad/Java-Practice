import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class FindDuplicate {

	public static void main(String[] args) {
		//Creating the array of n items with values [1, n-1] but with 1 duplicate. Values are unsorted

		//just do this for an example set of numbers
		int[] array = {2,5,9,8,1,7,2,4,6,3};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int a:array) {
			arr.add(a);
		}


		//Printing the UN-Sorted array
		System.out.print("The Unsorted Array: ");
		for(int a:arr) {
			System.out.print(String.valueOf(a) + " ");
		}
		System.out.println();	


		// sort then do duplicate detection

		//Sorting --> Runtime: ???
		//TODO: Determine runtime and implementation of Collections.sort()
		//TODO: Write Algorithm that sorts in O(n) time
		Collections.sort(arr);

		//Printing the Sorted array
		System.out.print("The Sorted Array: ");
		for(int a:arr) {
			System.out.print(String.valueOf(a) + " ");
		}
		System.out.println();

		//Duplicate Detection --> O(n)
		for(int i=0; i<arr.size()-1;i++) {
			int curr = arr.get(i);
			int next = arr.get(i+1);
			if(curr == next) {
				System.out.print("The Duplicate Is: " + String.valueOf(curr));
			}
		}

	}
}