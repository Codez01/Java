
public class BTree<E> {

	Node<E> rootOriginal, root; // root original , and root that changes towards the nodes.
	int size;
	String String;
	//***************************************************************************************************


	public BTree() { // empty constructor that gives the value of 0 to size and null to both roots
		rootOriginal = null;
		root = null;
		size = 0;
	}
	//***************************************************************************************************


	public void addByPath(E data, String path) throws InvalidPathException { 
// a method for adding sons(new nodes) to the binary tree following their giving path and soring the given data
		root = rootOriginal;
		if (path.length() == 0) {
			rootOriginal = new Node<E>(data, null, null);
			size++;
		}

		try {

			for (int i = 0; i < path.length(); i++) {

				if (path.charAt(i) == 'R' && i == path.length() - 1) {
					if (root.getRightson() == null) {

						root.setRightson(new Node<E>(data, null, null));
						size++;

					}

					else {
						throw new InvalidPathException();
					}

				} else if (path.charAt(i) == 'R' && i < path.length()) {

					root = root.getRightson();

				}

				if (path.charAt(i) == 'L' && i == path.length() - 1) {
					if (root.getLeftson() == null) {

						root.setLeftson(new Node<E>(data, null, null));
						size++;

					} else {

						throw new InvalidPathException();
					}

				} else if (path.charAt(i) == 'L' && i < path.length()) {

					root = root.getLeftson();

				}

			}
		} catch (NullPointerException e) {

// throws invalid path Exception if the path is not found...
			throw new InvalidPathException();
		}

	}
	//***************************************************************************************************

	public String pre() {
//method for printing the tree 
		String = "";
		return prePrint(rootOriginal);

	}

	private String prePrint(Node<E> t) {
		if (t != null) {
			String += " " + t.getData();

			prePrint(t.getLeftson());
			prePrint(t.getRightson());

		}
		return String;
	}
	//***************************************************************************************************

	public int getSize() {
		// gives the size
		return size;
	}
	//***************************************************************************************************


	public E findByPath(String path) throws InvalidPathException {
		// it searches for the given path in the binary tree ( specific node)
		root = rootOriginal;
		try {
			for (int i = 0; i < path.length(); i++) {

				if (path.charAt(i) == 'R') {
					root = root.getRightson();
				} else if (path.charAt(i) == 'L') {
					root = root.getLeftson();
				}

			}
			return root.getData();
		} catch (NullPointerException e) {

			throw new InvalidPathException();

		}

	}
	//***************************************************************************************************

	

}
