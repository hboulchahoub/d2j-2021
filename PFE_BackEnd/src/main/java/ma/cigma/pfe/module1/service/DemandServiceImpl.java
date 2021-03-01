package ma.cigma.pfe.module1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.cigma.pfe.module1.dao.IDemandDao;
import ma.cigma.pfe.module1.models.Demand;

/**
 * this class is created to validate all rules related to 
 * business logic
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Service
@Transactional
public class DemandServiceImpl implements IDemandService {
	@Autowired
	private IDemandDao dao;

	@Override
	public Demand insertDemand(Demand d) {
		return dao.save(d);
	}

	@Override
	public Demand updateDemand(Demand d) {
		Demand old= dao.findById(d.getId()).get();
		old.setCompte(d.getCompte());
		old.setNb(d.getNb());
		return dao.save(old);
	}

	@Override
	public void deleteDemand(Demand d) {
		 dao.delete(d);
	}

	@Override
	public Demand selectDemandById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Demand> selectAll() {
		return (List<Demand>) dao.findAll();
	}

}
