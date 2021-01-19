package JDBCTest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public abstract class Shape implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2770995052929008077L;
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
}
