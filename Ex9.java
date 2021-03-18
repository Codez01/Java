
public class Ex9 {

	private static int DEFAULT = 0;
	
//Q1..................................................................................................
	public static void printAllBinary(int n) {
		//this method prints all the binary numbers in the length of 'n'
		
		printAllBinary("", n);
	}

	private static void printAllBinary(String s, int n) {
		// this method is a helping method for printAllBinary
		if (n >= DEFAULT) {
			if (n == DEFAULT) {
				System.out.println(s + " ");
			}
			printAllBinary(s + 0, n - 1);
			printAllBinary(s + 1, n - 1);
		}
	}
//Q2................................................................................................
	public static void printSubs(String s) {
		//this method prints all the sub string of the String 's'
		String a = s.substring(s.length() - 1);
		printSubs(s, "", a);

	}

	private static void printSubs(String s, String str, String a) {
		//this is a helping method for printSubs.
		if (s.length() == DEFAULT) {
			if (str.equals(a)) {
				System.out.println(str);
				return;
			}
			if (str.length() == DEFAULT)
				return;
			System.out.println(str + " , ");
			return;

		}
		printSubs(s.substring(1), str + s.substring(0, 1), a);
		printSubs(s.substring(1), str, a);
	}
	//..........................................................................................
}
