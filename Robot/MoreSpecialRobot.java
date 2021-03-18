
public class MoreSpecialRobot extends SpecialRobot {
	private int battery;

	public MoreSpecialRobot() {
		// a defualt constructor that is inherited from the superclass robot with adding the battery percentage
		super();
		this.battery = 100;

	}

	public MoreSpecialRobot(String a) {
		// a constructor that is inherited from the superclass robot with adding the battery percentage

		super(a);
		this.battery = 100;

	}

	public MoreSpecialRobot(String a, int x, int y, int f) {
		// a consturctor that is inherited from the super class robot with adding the battery percentage

		super(a, x, y, f);
		this.battery = 100;

	}

	public int getBattery() {
		// method for geeting the value of battery
		return battery;
	}

	public void move() {
// a method that is used to move the robot to a specific direction with losing 1 percent of battery each move ,
		//and it is an inherited method 

		if (this.battery > 0) {

			if (super.getPositionX() != 0 && super.getFacing() == WEST) {
				super.move();
				battery--;
			}

			else if (super.getPositionY() != 0 && super.getFacing() == SOUTH) {
				super.move();
				battery--;
			} else if (super.getFacing() == NORTH) {
				super.move();
				battery--;
			} else if (super.getFacing() == EAST) {
				super.move();
				battery--;
			}

		}

	}

	public String toString() {
// this method is for showing the type style. like the robot is at ( X,y) facing :  north , battery percentage  :

		if (super.getFacing() == 1) {
			String n =super.toString(); 
			String s = "   battery at :" + battery + "%" ;
			return n+s ;

		} else if (super.getFacing() == 2) {
		
			String n =super.toString(); 
			String s = "   battery at :" + battery + "%" ;
			return n+s ;
		} else if (super.getFacing() == 3) {
		
			String n =super.toString(); 
			String s = "    battery at :" + battery + "%" ;
			return n+s ;
		} else {
			String n =super.toString(); 
			String s = "    battery at :" + battery + "%" ;
			return n+s ;
			
		}

	}

}
