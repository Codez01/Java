
public class Monom {

	private double coeff;// it's the number beside X

	public int exp; // the power of X

	public double getCoeff() {
		return coeff;
	}

	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Monom(double coeff, int exp) {
		// this method gets the value of coeff and exp

		if (coeff == 0) {

			coeff = 1; // if coeff is 0 then it will change to 1

		} else if (exp < 0) {
			exp = 1; // if the power of x is 0 or less then it will change to 1

		}

		this.coeff = coeff;
		this.exp = exp;

	}

	public String toString() { 
		// this method is for typing the style of the monom like :  3x^5

		if (this.exp == 1 && this.coeff == 1) {
			String e =  "x";
			return e;

		}
		if (this.coeff == 1.0 && this.exp == 0) {
			String f = " 1 ";
			return f;
		}

		if (this.coeff == 1 && this.exp != 1) {
			String b =  "x^" + this.exp;
			return b;

		}
		if (this.exp == 0) {
			String c = "" + this.coeff ;
			return c;
		}
		if (this.exp == 1 ) {
			String d = this.coeff + "x";
			return d;
		}

		String h = this.coeff + "x^" + this.exp;
		return h;

	}

	public double evaluate(double x) { 
		// this method is for  solving the monomial value by replacing x with the number x

		double sum = this.coeff * (Math.pow(x, this.getExp()));
		return sum;

	}
	
	
	

}
