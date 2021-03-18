
public class SpecialRobot extends Robot {

	public SpecialRobot() {
		// a defualt constructor that is inherited from the superclass robot
		super();
	}

	public SpecialRobot(String a) {
		// a constructor that is inherited from the superclass robot

		super(a);

	}

	public SpecialRobot(String a, int x, int y, int f) {
		// a consturctor that is inherited from the super class robot

		super(a, x, y, f);

	}

	public void move() {
		// a method that is used to move the robot to a specific direction and it is an inherited method 

		super.move();

	}

	public void turnRight() {
		// this method is used to change the directions that the robot is facing to the right

		if (super.getFacing() == NORTH) {

			super.turnLeft();
			super.turnLeft();
			super.turnLeft();

		} else if (super.getFacing() == SOUTH) {

			super.turnLeft();
			super.turnLeft();
			super.turnLeft();

		} else if (super.getFacing() == EAST) {
			super.turnLeft();
			super.turnLeft();
			super.turnLeft();

		} else if (super.getFacing() == WEST) {

			super.turnLeft();
			super.turnLeft();
			super.turnLeft();

		}
	}

}
