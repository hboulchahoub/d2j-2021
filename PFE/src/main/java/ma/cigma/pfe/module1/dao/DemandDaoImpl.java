package ma.cigma.pfe.module1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.module1.models.Demand;

/**
 * this class is created to update the database
 * and it will implement all CRUD  operations
 * It is responsible for database access.
 * will use JPA to implement it.
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Repository
public class DemandDaoImpl implements IDemandDao {
	private EntityManagerFactory emf= 
	Persistence.createEntityManagerFactory("abc");
	private EntityManager em=emf.createEntityManager();
	@Override
	public boolean insert(Demand d) {
		// Transaction
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return false;
	}
	public static void main(String[] args) {
		IDemandDao dao = new DemandDaoImpl();
		Demand d= new Demand();
		d.setCompte("A200");
		d.setNb(30);
		dao.insert(d);
	}
	@Override
	public boolean update(Demand d) {
		return false;
	}

	@Override
	public boolean delete(Demand d) {
		return false;
	}

	@Override
	public boolean select(Demand d) {
		return false;
	}

}
