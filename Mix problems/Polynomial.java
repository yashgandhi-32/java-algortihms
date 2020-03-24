package l10;

public class Polynomial {
	
	DynamicArray coefficients;
	
	public Polynomial() {
		coefficients = new DynamicArray();
	}
	
	public void setCoefficient(int deg, int coeff) {
		if (deg > coefficients.size()) {
			for (int i = coefficients.size(); i < deg; i++) {
				coefficients.add(0);
			}
		}
		coefficients.set(deg, coeff);
	}
	
	public int getCoefficient(int deg) {
		if (deg >= coefficients.size()) {
			return 0;
		}
		return coefficients.get(deg);
	}
	
	public int degree() {
		for (int i = coefficients.size() - 1; i >=1; i--) {
			if (coefficients.get(i) != 0) {
				return i;
			}
		}
		return 0;
	}
	
	public void print() {
		for (int i = 0; i < coefficients.size(); i++) {
			if (coefficients.get(i) > 0) {
				System.out.print(coefficients.get(i) + "x^" + i + " + ");
			}
		}
		System.out.println();
	}
	
	public void add(Polynomial p) {
		for (int i = 0; i <= p.degree(); i++) {
			this.setCoefficient(i, this.getCoefficient(i) + p.getCoefficient(i));
		}
	}
	
	public void subtract(Polynomial p) {
		for (int i = 0; i <= p.degree(); i++) {
			this.setCoefficient(i, this.getCoefficient(i) - p.getCoefficient(i));
		}
	}
	
	public void multiply(Polynomial p) {
		Polynomial newPoly = new Polynomial();
		for (int i = 0; i <= p.degree(); i++) {
			for (int j = 0; j <= this.degree(); j++) {
				newPoly.setCoefficient(i + j, newPoly.getCoefficient(i + j) 
						+ this.getCoefficient(j) * p.getCoefficient(i));
			}
		}
		
		for (int i = 0; i <= this.degree(); i++) {
			this.setCoefficient(i, 0);
		}
		
		for (int i = 0; i <= newPoly.degree(); i++) {
			this.setCoefficient(i, newPoly.getCoefficient(i));
		}
	}
	
	public int evaluate(int x) {
		int currentDegree = 1;
		int i = 0;
		int ans = 0;
		while (i <= degree()) {
			ans = ans + currentDegree * getCoefficient(i);
			currentDegree = currentDegree * x;
			i++;
		}
		return ans;
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial newP = new Polynomial();
		int maxD = Math.max(p1.degree(), p2.degree());
		for (int i = 0; i <= maxD; i++) {
			newP.setCoefficient(i, p1.getCoefficient(i) + p2.getCoefficient(i));
		}
		return newP;
	}
	
}
