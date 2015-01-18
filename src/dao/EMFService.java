package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//entity manager factory
public class EMFService {
	private static final EntityManagerFactory emfInstance = Persistence
	      .createEntityManagerFactory("transactions-optional");

	  private EMFService() {
	  }

	  public static EntityManagerFactory get() {
	    return emfInstance;
	  }
}
