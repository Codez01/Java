
public class Classroom {
	
	
	private int  classNum; // class number
	
	private int capacity;// how many people can be in
	
	private boolean isUseable; // if it has everything that we need

	
	public Classroom( int Classnum , int capacity , boolean isUseable) {
		this.classNum = Classnum;
		this.capacity = capacity;
		this.isUseable = isUseable;
	}
	
	public String toString() { 
		if(this.isUseable == true) {
		 String s = "Class Number: " + this.classNum + "  can contain : "+ this.capacity + " people max , Class is useable";
		 return s;
		}
		
		String n = "Class Number: " + this.classNum + "  can contain : "+ this.capacity + " people max , Class is not useable";
		return n;
	}

	public int getClassNum() {
		return classNum;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isUseable() {
		return isUseable;
	}
	
	
	
	
}
