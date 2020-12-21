package ma.cigma.pfe.module1.dao;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.module1.models.Demand;

/**
 * this class is created to update the database
 * and it will implement all CRUD  operations
 * It is responsible of all access to database.
 * will use JPA to implement it.
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Repository
public class DemandDaoImpl implements IDemandDao {
	@Override
	public boolean insert(Demand d) {
		System.out.println("Calling dao Insert...");
		return false;
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
