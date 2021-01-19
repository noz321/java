package JDBCTest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity public class Circle implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private static final long serialVersionUID = 1L;
	double r;
	double PI = Math.PI;
	
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", pi=" + PI + "]";
	}

}