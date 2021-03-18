//Class -4-

public class PrintingServer {
	
	PriorityQueue PriorityQueue;
	
	//**********************************************************************************
	
	PrintingServer() {
		
		PriorityQueue = new PriorityQueue();
		
	}
	
	//**********************************************************************************
	
	public void acceptJob(PrintJob p) {
		
		PriorityQueue.insert((Prioritizeable) p);
	}
	
	//**********************************************************************************

	public void print() {
		//this method prints the specific text by taking it's priority number
		if (PriorityQueue.Array[0] == null) {
			return;
		}
		PrintJob save = (PrintJob) PriorityQueue.remove();
		System.out.println(save.getText());
	}
	
	//**********************************************************************************
}