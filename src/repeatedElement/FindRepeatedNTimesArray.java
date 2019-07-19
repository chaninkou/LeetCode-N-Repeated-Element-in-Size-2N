package repeatedElement;

public class FindRepeatedNTimesArray {
	// How to find n repeated element in an array
	public int repeatedNTimes(int[] A) {
		
		// start from 2 and compare 2 to 1 and 2 to 0 index
		for (int i = 2; i < A.length; i++) {
			if (A[i] == A[i - 1] || A[i] == A[i - 2]) {
				return A[i];
			}
		}

		return 0;

		// // Using Hashset, if an element is already in set and add will give
		// you false
		// Set<Integer> store = new HashSet<>();

		// for(int number : A){
		// if(store.add(number) == false){
		// return number;
		// }
		// }

		// return 0;
	}
}
