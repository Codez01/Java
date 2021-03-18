
public class Ex8 {
//Q1........................................................................................
	public static int howManyEven(int num) {
		// this method gives how many even numbers are there in  the number ''num''.

		if (num == 0) {
			return 0;

		}

		else if (num % 2 == 0) {
			return 1 + howManyEven(num / 10);

		}

		return howManyEven(num / 10);
	}
//Q2.........................................................................................
	public int longestAscending(int[] a) {
		//this method gives a new array including the longest and the highest numbers in an array.
		if (a == null || a.length == 0)
			return 0;
		return help(a, 0, 1);
	}

	public int help(int[] a, int b, int c) {
		//this is a helping method for LONGEST-ASCENDING method.

		if (c == a.length) {
			return 1;
		}

		if (a[b] < a[c]) {
			return 1 + help(a, c, c + 1);

		} else {
			return help(a, b, c + 1);
		}

	}
//Q3...........................................................................................
	public int[] merge(int[] a, int[] b) {
		//this method merges between two arrays into a new sorted array.
		int[] c;
		c = new int[a.length + b.length];
		help2(a, b, c, 0, 0, 0);

		return c;

	}

	public static void help2(int[] a, int[] b, int[] c, int k, int d, int l) {
		//this method is a helping method for  the method : merge.

		if (k == a.length && d == b.length) {
			return;
		} else if (k == a.length) {
			c[l] = b[d];
			help2(a, b, c, k, d + 1, l + 1);
		} else if (d == b.length) {
			c[l] = a[k];
			help2(a, b, c, k + 1, d, l + 1);
		}

		else if (a[k] < b[d]) {
			c[l] = a[k];
			help2(a, b, c, k + 1, d, l + 1);
		}

		else {
			c[l] = b[d];
			help2(a, b, c, k, d + 1, l + 1);

		}

	}
	//Q4.....................................................................................

	public boolean equalIgnoreCase(String s1, String s2) {
		//this method checks if the two Strings : s1 and s2 are even.
		if (s1.length() != s2.length()) {
			return false;
		}
		if (s1.length() == 0) {
			return true;
		}
		char c_s1 = s1.charAt(0);
		char c_s2 = s2.charAt(0);
		if (c_s1 >= 'a' && c_s1 <= 'z') {
			c_s1 -= 32;

		}
		if (c_s2 >= 'a' && c_s2 <= 'z') {
			c_s2 -= 32;

		}
		if (c_s1 == c_s2) {
			return equalIgnoreCase(s1.substring(1), s2.substring(1));

		}

		return false;

	}
}
//done............................................................................................