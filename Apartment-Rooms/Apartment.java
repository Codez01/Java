

public class Apartment {
	private String family;
	private int flat;
	private Room firstRoom;
	private Room secondRoom;
	private Room thirdRoom;
	private int numOfRooms;

	public Apartment(String name, int flat) { // gets the name  of the apartment and the room that the person stays at
		this.family = name;
		if (flat < 0) { // if flat is less than 0 it becomes 0
			this.flat = 0;
		} else {
			this.flat = flat;
		}
		this.firstRoom = null;
		this.secondRoom = null;
		this.thirdRoom = null;
		this.numOfRooms = 0;
	}

	public String getFamily() { // gets the name of family
		return this.family; // returns the name of the family
	}

	public int getFlat() { // gets the room that the family stays at
		return this.flat; // returns that room
	}

	public Room getRoomByType(String type) { // constructor that give each existent room a type
		if (this.firstRoom != null && this.firstRoom.getType() == type) {
			return new Room(this.firstRoom);
		} else if (this.secondRoom != null && this.secondRoom.getType() == type) {
			return new Room(this.secondRoom);
		} else if (this.thirdRoom != null && this.thirdRoom.getType() == type) {
			return new Room(this.thirdRoom);
		} else {
			return null;
		}
	}

	public int getNumOfRooms() { // gets the number of the rooms in the appartment
		return this.numOfRooms; //returns the number of the rooms
	}

	public void setRoom(Room r) { // sets the room to r if it doesnt exist from a 3 rooms
		if (this.numOfRooms < 3) {
			if (this.firstRoom == null) {
				this.firstRoom = new Room(r);
				this.numOfRooms++;
			} else if (this.secondRoom == null) {
				this.secondRoom = new Room(r);
				this.numOfRooms++;
			} else if (this.thirdRoom == null) {
				this.thirdRoom = new Room(r);
				this.numOfRooms++;
			}
		}
	}

	public double getTotalArea() { // gets the area of the appartment
		double Area = 0;
		if (this.firstRoom != null) {
			Area += this.firstRoom.getArea();
		} else if (this.secondRoom != null) {
			Area += this.secondRoom.getArea();
		} else if (this.thirdRoom != null) {
			Area += this.thirdRoom.getArea();
		}
		return Area;
	}

	public String toString() { 
		String details = "[" + this.family + "]'s apartment, " + "flat [" + this.flat + "] has [" + this.numOfRooms
				+ "] rooms";
		if (this.firstRoom != null) {
			details += this.firstRoom.toString();
		} else if (this.secondRoom != null) {
			details += this.secondRoom.toString();
		}
		if (this.thirdRoom != null) {
			details += this.thirdRoom.toString();
		}
		return details;
	}

}
