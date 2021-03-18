import java.util.Arrays;

public class Element {

	public static int[] Add(int[] a, int[] b) {//adds up too numbers using arrays

		int temp, carry = 0;

		int n = a.length;

		int[] res = new int[n+1];
		

		for (int i = n-1; i >= 0; i--) {

			temp = a[i] + b[i] + carry;

			res[i+1] = temp % 10;

			carry = temp / 10;

		}

		res[0] = carry;
		return res;

	}

	public static void main(String[] args) {

		int[] a = { 2, 9, 6, 2 };
		int[] b = { 9, 4, 7 ,1 };

		System.out.println(Arrays.toString(Add(a, b)));

	}

}