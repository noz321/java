package JDBCTest;

import javax.persistence.Entity;

@Entity class Square extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4334851970440275543L;
	private double sideA;

	public Square() {
		super();
	}

	public Square(double sideA) {
		this.sideA = sideA;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	
	
}
