import java.util.Arrays;

public class Element2 {

	public static Element[] toArray(double[][] mat) {
	
		
		
		int size = 0;
		int tempsize = 0;
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] != 0) {
					size++;
				}
			}

		}

		Element[] array_of_elements = new Element[size];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] != 0) {
					if (tempsize != size) {

						array_of_elements                              [tempsize] = new Element(i, j, mat[i][j]);
						tempsize++;
					}				}
			}

		}
		return array_of_elements;

	}

public static void main(String[] args) {
	
	 double[][] array = {{0,0,6,0},{9,0,0,0},{0,3,0,0}};
	 
	
	 
	 System.out.println(Arrays.toString(toArray(array)));
	
}

}
}