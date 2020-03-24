package l10;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void print() {
		
	}

	public void add(ComplexNumber c2) {
		
	}

	public void multiply(ComplexNumber c2) {
		
	}

	public ComplexNumber conjugate() {
		return new ComplexNumber(real, -1 * imaginary);
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3) {
		// TODO Auto-generated method stub
		return null;
	}

}
