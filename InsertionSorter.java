import java.util.Arrays;

public class InsertionSorter extends ArraySorter {

	public int[] sort(int[] a, boolean verbose) {
		// this method is for sorting an array using insertion sorting method.

		boolean information = verbose;
		name = "InsertionSort ";

		int[] array = super.ArrayCopier(a);

		super.arrayLength = array.length;
		int n = array.length;

		boolean counted = false;
		int[] Array = super.ArrayCopier(a);// the copy of the array to avoid aliasing!
		for (int j = 1; j < n; ++j) {
			int key = Array[j];
			int i = j - 1;
			counted = true;// it is used to check if there is any comparisons.
			counter++;

			while (i >= 0 && Array[i] > key) {

				Array[i + 1] = Array[i];

				i--;

				if (information) {
					System.out.println(Arrays.toString(Array));
				}
				if (counted == false)
					counter++;
				counted = false;
			}
			if (i >= 0 && counted == false)
				counter++;
			Array[i + 1] = key;
		}
		if (information) {
			System.out.println(Arrays.toString(Array));
		}
		return a;
	}
}