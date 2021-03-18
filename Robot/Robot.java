
public class Robot {

	private String name;
	private int positionX;
	private int positionY;
	private int facing;


	public final static int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;

	public Robot() { 
// a default constuctor that sets the value of x = 0 y=0 and facing  = north if not given any.
		this.name = "bot";
		this.positionX = 0;
		this.positionY = 0;
		this.facing = this.NORTH;

	}

	public Robot(String a) {
// a constructor that u can name the robot with and sets the position of the defualt
		this.name = a;
		this.positionX = 0;
		this.positionY = 0;
		facing = this.NORTH;
	}

	public Robot(String a, int x, int y, int f) {
// the contructor that gives values to position x,y and sets the directionn of the robot and also name it

		this.name = a;

		if (x < 0) {

			x = 0;

		}
		if (y < 0) {
			y = 0;
		}

		if (f < 1 || f > 4) {

			f = 1;

		}

		this.positionX = x;
		this.positionY = y;
		this.facing = f;

	}
// methods of getting the value of variables 
	public String getName() {
		return name;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public static int getNorth() {
		return NORTH;
	}

	public static int getEast() {
		return EAST;
	}

	public static int getSouth() {
		return SOUTH;
	}

	public static int getWest() {
		return WEST;
	}

	public int getFacing() {
		return facing;
	}

	public void setFacing(int facing) {
		this.facing = facing;
	}

	public String toString() { 
		// this method is for showing the type style. like the robot is at ( X,y) facing : north

		if (this.facing == 1) {

			String s = this.name +  "  is at : ( " + positionX + " , " + positionY + " )" + " facing: NORTH";
			return s;

		} else if (this.facing == 2) {
			String s = this.name + "  is at : ( " + positionX + " , " + positionY + " )" + " facing: EAST";
			return s;
		} else if (this.facing == 3) {
			String s = this.name + "   is at :( " + positionX + " , " + positionY + " )" + " facing: SOUTH";
			return s;
		} else {
			String s = this.name + "   is at : ( " + positionX + " , " + positionY + " )" + " facing: WEST";
			return s;
		}

	}

	public void move() {
		// this method is used to move the robot  to the way it's facing
		if (positionX >= 0 && positionY >= 0) {

			if (this.facing == NORTH) {

				this.positionY += 1;
				this.facing = NORTH;

			}

			if (this.facing == SOUTH) {

				this.positionY -= 1;
				this.facing = SOUTH;
			}
			if (this.facing == EAST) {
				this.positionX += 1;

				this.facing = EAST;
			}
			if (this.facing == WEST) {
				this.positionX -= 1;

			}

			if (positionX < 0) {
				if (this.facing == NORTH) {

					this.positionY += 1;
					this.positionX = 0;
					this.facing = NORTH;

				}

				if (this.facing == SOUTH) {

					this.positionY -= 1;
					this.positionX = 0;
					this.facing = SOUTH;
				}
				if (this.facing == EAST) {

					this.positionX = 0;

					this.facing = EAST;
				}
				if (this.facing == WEST) {

					this.positionX = 0;

				}

			}
			if (positionY < 0) {
				if (this.facing == NORTH) {

					this.positionY = 0;

					this.facing = NORTH;

				}

				if (this.facing == SOUTH) {

					this.positionY = 0;

					this.facing = SOUTH;
				}
				if (this.facing == EAST) {

					this.positionX += 1;

					this.facing = EAST;
				}
				if (this.facing == WEST) {

					this.positionX -= 1;

				}

			}
		}

	}

	public void turnLeft() {
		
		// this method is for changing the directions that the robot is facing to the left

		if (positionX >= 0 && positionY >= 0) {

			if (this.facing == NORTH) {

				this.facing = WEST;

			} else if (this.facing == SOUTH) {

				this.facing = EAST;
			} else if (this.facing == EAST) {

				this.facing = NORTH;
			}

			else {
				this.facing = SOUTH;

			}
		}

	}

}
