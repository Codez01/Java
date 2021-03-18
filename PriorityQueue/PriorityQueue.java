//Class -2-

public class PriorityQueue {
	//**********************************************************************************

Prioritizeable[] Array;

 public PriorityQueue() {

		Array = new Prioritizeable[100];
//an array made of 100 objects from the type prioritizeable
	}
	//**********************************************************************************
	public void insert(Prioritizeable element) {
		
//it gets the element from the type Prioritizeable and  put it in a sorted order of priorities
		
		for (int j = 0; j < Array.length; j++) {
			if (Array[j] == null) {
				Array[j] = element;
				return;
			}

			if (Array[j].getPriority() < element.getPriority()) {
				Prioritizeable save1; Prioritizeable save2;
				
				save1 = element;
				
				for (int i = j; save1 != null && i < Array.length; i++) {
					save2 = Array[i];
					Array[i] = save1;
					save1 = save2;
				}
				break;
				// so it doesn't keep on looping
			}
		}
	}
	//**********************************************************************************
	public Prioritizeable remove() {
		//this method is for removing a specific priority from the array
		
		Prioritizeable save = Array[0];
		for (int j = 0; j < Array.length - 1; j++)
			Array[j] = Array[j + 1];
		Array[Array.length - 1] = null;
		return save;
	}
	//**********************************************************************************

	public String toString() {
		String string = "";

		for (int j = 0; j < Array.length && Array[j] != null; j++) {

			string = string.concat(Array[j] + "\n");
		}

		return string;
	}
	//**********************************************************************************

	
		
		
	

}