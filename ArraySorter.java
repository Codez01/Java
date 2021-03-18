
public abstract class ArraySorter {

	protected int counter = 0;//comparisons counter
    protected int arrayLength;//array length counter
	protected String name;//the name of the sorting method
//--------------------------------------------------------------------------------

	public abstract int[] sort(int[] a, boolean verbose);
	// this method sorts an array by a specific sorting method
	
//--------------------------------------------------------------------------------
	public String getStatistics() {
		// it is a method for showing the name of the sorting method used , comparisons counter
		//and the ratio.
		double sum = (double) counter / (double) arrayLength;
		if (arrayLength == 0 && counter == 0) {
			String n = name + "– Array length:" + arrayLength + " comparisons: " + counter + " ratio: 0.0";
			return n;
		}
		String s = name + "– Array length:" + arrayLength + " comparisons: " + counter + " ratio: " + sum;

		return s;
	}
//--------------------------------------------------------------------------------
	protected int[] ArrayCopier(int[] a) {
		// this method copies a specific array to avoid aliasing!
		int[] arr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		return arr;
	}

}
