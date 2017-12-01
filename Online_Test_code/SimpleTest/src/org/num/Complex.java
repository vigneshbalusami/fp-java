package org.num;

public class Complex {
	private int real;
	private int imaginary;

	public Complex add(int real, int imaginary) {
		Complex out = new Complex();
		out.setReal(real + this.real);
		out.setImaginary(imaginary + this.imaginary);
		return out;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

}
