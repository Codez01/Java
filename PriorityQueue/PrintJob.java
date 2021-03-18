//Class -3-

public class PrintJob implements Prioritizeable {
	
	//**********************************************************************************
	
	private int priority;
	
	private String string;
	
	
	//**********************************************************************************

	public PrintJob(String Text, int priority) {
//this method is for setting what to print and making sure that it's priority is betweeen 0 -10
		if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
			string = Text;
			this.priority = priority;
		}
	}
	//**********************************************************************************
	
	public int getPriority() {
		// gets priority number
		
		return this.priority;
	}
	
	//**********************************************************************************
	
	public void setPriority(int p) {
		// changes the priority number value
		this.priority = p;
	}
	
	//**********************************************************************************
	
	public String getText() {
		// get's the text inserted
		return string;
	}
	
	//**********************************************************************************
	
	public int compareTo(Object o) {
//it compares the priority set and the one put in this method 
		return getPriority() - ((Prioritizeable) o).getPriority();
	}
	
	//**********************************************************************************
}