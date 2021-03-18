

public class Linear {
	private double a, b;

	public Linear(double a, double b) { // constructor that takes two parameters
		this.a = a;
		this.b = b;

	}

	public Linear(Linear lin) {
		this.a = lin.a;

		this.b = lin.b;

	}

	public double getA() { // returns the value of a
		return a;

	}

	public double getB() { // returns the value of b
		return b;

	}

	public String toString() { // returns string
		if (b == 0) {

			String string = "Y" + " = " + a + "x"; // the function looks like this if b =0
			return string;

		} else if (a == 0) {

			String string = "Y" + " = " + b; // the function looks like this if a =0
			return string;
		}

		else if (a == 0 && b == 0) { // the function looks like this if a & b = 0

			String string = " Y = 0";
			return string;
		} else

		{
			String string = "Y" + " = " + a + "x" + " +  " + b; // the functions looks like this if a and b are known
			return string;
		}

	}

	public double assign(double x) { // takes the value of x and replace it in the function of y
		x = x * a + b;
		return x;

	}

	public double solve(double y) { // takes the value of y and replaces it in the function of x
		y = (y - b) / a;
		return y;

	}

	public double getIntersection(Linear other) { // returns the value of the intersection between to functions
		double x = (other.b - this.b) / (this.a - other.a);
		return x;
	}

	public boolean isOnLine(double x, double y) { // takes the value of x,y and check if it's on the line
		if ((y) == (this.a * x + this.b)) {
			return true;

		}
		return false;
	}

	public boolean areParallel(Linear other) {
		if (this.a == other.a) {
			return true;
		}
		return false;
	}

	public Linear createLinear(double x1, double y1, double x2, double y2) { // takes the value of x1,x2 & ,y2,y1 if x1
																				// doesn't equal x2 and y1 doesn't equal
																				// y2 then it makes a new function
																				// replacing the new coordinates
		if ((x1 != x2) && (y1 != y2)) {
			double m = (y2 - y1) / (x2 - x1);
			this.a = m; 
			this.b = (y2 - (m * x2));
			Linear linear1 = new Linear(a, b);
			return linear1; // returns linear

		}

		return null; // returns nothing, if x1 = x2 or y2=y1

	}

}
