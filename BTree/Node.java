

import java.util.List;
//***************************************************************************************************

public class Node<E> {
	
	private E data;
	
	private Node<E> leftson;
	
	private Node<E> rightson;
	//***************************************************************************************************


	public Node(E data, Node<E> left, Node<E> right) {
		// the constructor gets the value of  data , left son , right son.
		this.data=data;
		this.leftson=left;
		this.rightson=right;
	}
	//***************************************************************************************************


	public E getData() {//gets the data
		return data;
	}

	//***************************************************************************************************

	public void setData(E data) {//changes the value of data
		this.data = data;
	}
	//***************************************************************************************************

	public Node<E> getLeftson() { // gets the value of left son
		return leftson;
	}
	//***************************************************************************************************

	public void setLeftson(Node<E> leftson) {// changes the value of left son
		this.leftson = leftson;
	}
	//***************************************************************************************************

	public Node<E> getRightson() {// get the value of right son
		return rightson;
	}
	//***************************************************************************************************

	public void setRightson(Node<E> rightson) {// changes the value of right son
		this.rightson = rightson;
	}
	//***************************************************************************************************

}