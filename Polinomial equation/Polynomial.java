import java.util.ArrayList;
import java.util.Collection;

public class Polynomial {

	private ArrayList<Monom> monoms = new ArrayList<Monom>();

	public Polynomial() { // if there were no monoms added the polynomial will be empty

		monoms.isEmpty();

	}

	public String toString() {
	// this method is for typing the style of the polynomial  according to the power of x from lower to higher and by taking "-+" into consideration
		String e = " ";
		if (this.monoms.isEmpty())
			return "0";
		ArrayList<Monom> sortedExp = new ArrayList<Monom>();
		for (int i = 0; i < monoms.size(); i++) {
			sortedExp.add(monoms.get(i));
		}

		for (int i = 0; i < sortedExp.size(); i++) { // sorting the monom exp in the polynom
			for (int j = i; j < sortedExp.size(); j++) {
				if (sortedExp.get(i).getExp() > sortedExp.get(j).getExp()) {
					Monom temp = sortedExp.get(i);

					sortedExp.set(i, sortedExp.get(j));
					sortedExp.set(j, temp);

				}
			}
		}

		for (int n = 0; n < sortedExp.size(); n++) {
			// making sure that + doesn't come with - and giving the polynom  its right image 
			if (n == 0)
				e += " " + sortedExp.get(0);

			if (sortedExp.get(n).getCoeff() > 0 && n != 0) {

				e += " + " + sortedExp.get(n);
			}
			if (sortedExp.get(n).getCoeff() < 0 && n != 0) {
				e += " " + sortedExp.get(n);
			}

		}
		return e;

	}

	public double evaluate(double x) {
		
		//this method is for summing the value of the polynom by giving this.x a value of  x

		double sum = monoms.get(0).evaluate(x);

		for (int i = 1; i < monoms.size(); i++) {
			if (monoms.get(i).getCoeff() < 0) {
				sum += monoms.get(i).evaluate(x);

			}

			if (monoms.get(i).getCoeff() > 0) {
				sum += monoms.get(i).evaluate(x);

			}
			sum += 0;

		}
		return sum;

	}

	public void addMonom(Monom m) {
		// this method is for adding a monom for the polynom 

		double coeff = 0;
		boolean n = false;

		for (int i = 0; i < monoms.size(); i++)
			if (m.getExp() == monoms.get(i).getExp())
				n = true;
		if (n == true) {
			for (int i = 0; i < monoms.size(); i++) {
				if (m.getExp() == monoms.get(i).getExp()) {
					coeff += monoms.get(i).getCoeff() + m.getCoeff();

					if (coeff != 0) {
						monoms.set(i, new Monom(coeff, m.getExp()));
					} else {
						this.monoms.remove(monoms.get(i));
					}
				}
			}
		} else {

			monoms.add(m);
		}
	}

	public Polynomial derivative() {
		
		//this method gives the drivative of the polynomial

		Polynomial deri = new Polynomial();

		ArrayList<Monom> arrayCopy = new ArrayList<Monom>();
		for (int i = 0; i < monoms.size(); i++) {
			arrayCopy.add(monoms.get(i));
		}

		for (int i = 0; i < arrayCopy.size(); i++) {

			if (arrayCopy.get(i).getExp() != 0 && arrayCopy.get(i).getCoeff() != 0) {

				deri.addMonom(new Monom(arrayCopy.get(i).getCoeff() * arrayCopy.get(i).getExp(),
						arrayCopy.get(i).getExp() - 1));

			}

			if (arrayCopy.get(i).getCoeff() == 0) {
				deri.monoms.remove(arrayCopy.get(i));
			}
			if (arrayCopy.get(i).getExp() == 0) {
				deri.monoms.remove(arrayCopy.get(i));
			}

			if (arrayCopy.isEmpty()) {
				return new Polynomial();
			}

		}

		return deri;

	}

	public Polynomial derivative(int n) {
		// this method is for giving the derivative of the polynomial for n times

		Polynomial deri = new Polynomial();
		Polynomial deriv = new Polynomial();

		ArrayList<Monom> arrayCopy = new ArrayList<Monom>();

		for (int i = 0; i < monoms.size(); i++) {
			arrayCopy.add(monoms.get(i));
		}
		if (arrayCopy.isEmpty()) {
			return new Polynomial();
		}
		for (int i = 0; i < monoms.size(); i++) {
			deri.addMonom(new Monom(monoms.get(i).getCoeff(), monoms.get(i).getExp()));
		}

		if (n <= 0) {
			for (int i = 0; i < arrayCopy.size(); i++) {
				deriv.addMonom(new Monom(arrayCopy.get(i).getCoeff(), arrayCopy.get(i).getExp()));

			}

			return deriv;

		}

		else {

			for (int i = 0; i < n; i++) {

				deri = deri.derivative();

			}

		}

		return deri;
	}

//	public static Polynomial(String s) { // this method is not fully completed!
	
//		Polynomial monomial = new Polynomial();
//
//		String input = "";// string without the spaces !
//		
//		
//		for (int i = 0; i < s.length(); i++) {// it removes all the unneccesary symbols , spaces or chars and changes X to x .
//
//			if( s.charAt(i)== 'X') {
//				input += 'x';
//			}
//			if (s.charAt(i) == 'x' || s.charAt(i) == '^'  || s.charAt(i) == '-'
//					|| s.charAt(i) == '+' || s.charAt(i) >= '0' && s.charAt(i) < '9') {
//
//				input += s.charAt(i);
//			}
//			
//
//		}
//		for(int i = 0; i< input.length(); i++ ) { // this method removes "-" or "+" from the end.
//			 if (input != null && input.length() > 0 && input.charAt(input.length() - 1) == '-' ||input.charAt(input.length() - 1) == '+' ) {
//			        input = input.substring(0, input.length() - 1);
//			    }
//			   
//			
//			
//		}
//		
//		
//		
//		
//		
//		
//
//		
//		

	
}
