package JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

	static Connection con;
	static ResultSet smt;
	
	public static void main(String[] args) throws SQLException {

//		try {
//			con = DriverManager.getConnection("jdbc:mysql://10.6.213.194/teszt_jbeke?user=jbeke&password=Ahleb_aht9Che");
//					PreparedStatement stmt = con.prepareStatement("SELECT ?+?");
//					stmt.setInt(1, 5);
//					stmt.setInt(2, 9);
//					stmt.executeQuery();
//					smt = stmt.getResultSet();
//					
//		} catch (SQLException ex) {
//			
//			System.out.println("SQLException: " +ex.getMessage());
//		}
//		while(smt.next()) {
//			
//			System.out.println(smt.getInt(1));
//		}
		
		
		EntityManagerFactory manager = Persistence.createEntityManagerFactory("TestPersistence");
		
		EntityManager factManager = manager.createEntityManager();
		
		EntityTransaction transaction = factManager.getTransaction();
		
		transaction.begin();
		Circle circle = new Circle(5);
		factManager.persist(circle);
		transaction.commit();
		factManager.close();
		
 		
	}
}
