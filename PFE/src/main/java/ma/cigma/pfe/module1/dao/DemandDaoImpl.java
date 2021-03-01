package ma.cigma.pfe.module1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.module1.models.Demand;

/**
 * this class is created to update the database and it will implement all CRUD
 * operations It is responsible for database access. will use JPA to implement
 * it.
 * 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Repository
public class DemandDaoImpl implements IDemandDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

	private EntityManager em = emf.createEntityManager();

	@Override
	public boolean insert(Demand d) {
		// Transaction
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return false;
	}

	@Override
	public boolean update(Demand dnew) {
		Demand old = em.find(Demand.class, dnew.getId());
		Demand old1 = em.getReference(Demand.class, dnew.getId());
		System.out.println(old1);
		// old.setCompte(dnew.getCompte());
		return false;
	}

	public static void main(String[] args) {
		IDemandDao dao = new DemandDaoImpl();
		Demand dnew = new Demand();
		dnew.setId(1);
		dnew.setCompte("AAAA");
		dao.update(dnew);
	}

	@Override
	public boolean delete(Demand d) {
		return false;
	}
	
	@Override
	public List<Demand> select(Demand d) {
	Query query=em.createQuery("select from Demand d where d.compte=:param");
	
	
		query.setParameter("param", d.getCompte());
		return query.getResultList();
	}

}
