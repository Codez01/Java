

public class Room {
	private String type;
	private double area;

	public Room(String type, double area) { // gets the type of the room and the area of the room
		this.type = type;
		if (area < 0) { // if the area was less than 0 then the area becomes 0
			this.area = 0;
		} else {
			this.area = area;
		}
	}

	public Room(Room other) { // copying a constructor
		this.area = other.area;
		this.type = other.type;
	}

	public String getType() { // gets the type of the room
		return this.type;
	}

	public void setType(String name) { // changes the type of the room to 'name'
		this.type = name;
	}

	public double getArea() { // gets the area of the room
		return this.area;
	}

	public String toString() {
		return "\n" + "Room type: [" + this.type + "], Area: [" + this.area + "]"; // returns a string
	}

}
