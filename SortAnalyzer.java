public class SortAnalyzer {
	private ArraySorter[] sorters;// an array of the type ArraySorter.
	BubbleSorter b = new BubbleSorter();
	InsertionSorter c = new InsertionSorter();
	MergeSorter d = new MergeSorter();

	public SortAnalyzer() {

		this.sorters = new ArraySorter[3];// the length of the array sorters is 3
		sorters[0] = b;// the first index of array sorter is made of bubbleSorter class.
		sorters[1] = c;// the second index of array sorter is made of InsertionSorter class.
		sorters[2] = d;// the third index of array sorter is made of MergeSorter class.

	}

	public void analyze(int numOfArrays, int maxSize) {

		while (numOfArrays > 0) {
			if (maxSize < 10) {//if the max size was less than 10, it becomes 10.
				maxSize = 10;
			}
			int[] Array = new int[maxSize];
			for (int j = 0; j < maxSize; j++) {
				Array[j] = (int) (Math.random() * 100);// it fills the array of random numbers.

			}
			sorters[0].sort(Array, false);
			System.out.println(sorters[0].getStatistics());
			// prints the statistics of the sorted 'Array' using bubbleSorting method
			sorters[1].sort(Array, false);
			System.out.println(sorters[1].getStatistics());
			// prints the statistics of the sorted 'Array' using InsertionSorting method
			sorters[2].sort(Array, false);
			System.out.println(sorters[2].getStatistics());
			// prints the statistics of the sorted 'Array' using MergeSorting method
			numOfArrays--;

		}

	}

}