package JDBCTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TablePerClass {

	public static void main(String[] args) {

		EntityManagerFactory manager = Persistence.createEntityManagerFactory("TestPersistence");

		EntityManager factManager = manager.createEntityManager();

		EntityTransaction transaction = factManager.getTransaction();

		transaction.begin();
		
		factManager.persist(new Rectangle(5, 7));
		factManager.persist(new Square(32));
		transaction.commit();
		factManager.close();

		
	}

}
