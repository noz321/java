package JDBCTest;

import javax.persistence.Entity;

@Entity class Rectangle extends Shape {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1595163906490302691L;
	private double sideA, sideB;

	
	public Rectangle() {
		super();
	}

	public Rectangle(double sideA, double sideB) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	

}
