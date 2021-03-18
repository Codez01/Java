import java.util.Arrays;

public class MergeSorter extends ArraySorter {
	private boolean information;

	public int[] sort(int[] a, boolean verbose) {
		// this method is for sorting an array using merge sorting method.
		this.information = verbose;

		int length = a.length;
		arrayLength = length;

		this.name = "MergeSort";
		if (a.length == 0) {
			return new int[0];
		}
		int[] Array = super.ArrayCopier(a);// the copy of the array to avoid aliasing!

		mergeSort(Array, 0, Array.length - 1);

		return Array;
	}

	private void mergeSort(int[] Array, int First, int Last) {
		if (First >= Last) {
			return;
		}
		int middle = (First + Last) / 2;

		mergeSort(Array, First, middle);// this method divides the right sided array

		mergeSort(Array, middle + 1, Last);// this method divides the left sided array
		

		merge(Array, First, Last);//this method to merge between those two arrays after sorting them into one.

	}

	private void merge(int[] Array, int First, int Last) {
		int[] newArray = new int[Last - First + 1];
		int mid = (First + Last) / 2;

		int ArrayCounter = First;
		int ArrayCounter2 = mid + 1;

		for (int i = 0; i < newArray.length; i++) {
			
			if (ArrayCounter > mid) {
			

				while (ArrayCounter2 <= Last) {
				

					newArray[i] = Array[ArrayCounter2];
					i++;
					ArrayCounter2++;

				}

			} else if (ArrayCounter2 > Last) {// this situation if ArrayCounter2 still move after
				
				while (ArrayCounter <= mid) {
					
					newArray[i] = Array[ArrayCounter];
					i++;
					ArrayCounter++;

				}

			} else if (Array[ArrayCounter] < Array[ArrayCounter2]) {
				// the first part of array
				counter++;
				newArray[i] = Array[ArrayCounter];// copy to a new array
				ArrayCounter++;
				
			} else {
				counter++;
				newArray[i] = Array[ArrayCounter2];// copy to a new array
				ArrayCounter2++;
				

			}
			
		}
		
		for (int i = 0; i < newArray.length; i++) {
			
			Array[First] = newArray[i];// copy to an Array
			if (information) {
				System.out.println(Arrays.toString(Array));
			}
			
			First++;
			
			
		}
		
	
	}
	
}
