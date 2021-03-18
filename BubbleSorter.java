import java.util.Arrays;

public class BubbleSorter extends ArraySorter {

	protected int[] array;
	
//--------------------------------------------------------------------------------
	public int[] sort(int[] a, boolean verbose) {
		//this method is for sorting an array using bubbleSorting method.
		name = "Bubble Sort ";
		boolean information = verbose;
		array = super.ArrayCopier(a);// the copy of the array to avoid aliasing!
		int lastPos;
		int index;
		int temp;

		arrayLength = array.length;
		for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {
			for (index = 0; index <= lastPos - 1; index++) {
				counter++;
				if (array[index] > array[index + 1]) {

					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
					if (information) {
			         // if verbose == true it will prints the steps of the bubble sorting
						System.out.println(Arrays.toString(array));
					}
				}
			}
		}

		return array;
	}

}
