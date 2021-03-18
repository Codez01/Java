



public class MorseDecoder {

	private BTree<String> morseTree;
	
	private int INDEX = 0;
	//***************************************************************************************************


	public MorseDecoder() throws InvalidPathException {
// following morse decoder
		String[] lettersArr = { "", "E", "I", "S", "H",
				               "V", "U", "F",
			             	null, "A", "R", "L", null,
			       	"W", "P", "J", "T",
		  		"N", "D", "B", "X", "K", "C", 
			"Y", "M", "G", "Z", "Q", "O" };

		morseTree = new BTree<>();

		Tree(lettersArr, 0, "");

	}
	//***************************************************************************************************


	public void Tree(String[] lettersArr, int treeLevel, String path) throws InvalidPathException {

		if (treeLevel == 5 || this.INDEX >= lettersArr.length)
			return;

		if (lettersArr[INDEX] != null) {
			this.morseTree.addByPath(lettersArr[INDEX], path);
		}
		INDEX++;
		Tree(lettersArr, treeLevel + 1, path + "L");
		Tree(lettersArr, treeLevel + 1, path + "R");

	}
	//***************************************************************************************************

	private String Converter(String str) {
		//it converts to the RL format!

		str = str.replace('.', 'L').replace('-', 'R');

		return str;
	}
	//***************************************************************************************************



	public String toString() {

		return this.morseTree.pre();
	}

	//***************************************************************************************************

	public String decode(String morseStr) throws InvalidMorseCodeException, InvalidPathException {
		// a String method for decoding morse.

		return this.morseTree.findByPath(Converter(morseStr));
	}
	//***************************************************************************************************


	
}
