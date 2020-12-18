package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.dao.IDemandDao;
import ma.cigma.pfe.module1.models.Demand;

public class DemandServiceImpl implements IDemandService {
	
	// FAIRE passer l'objet à la couche service
	private IDemandDao dao;

	public IDemandDao getDao() {
		return dao;
	}

	public void setDao(IDemandDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean insertDemand(Demand d) {
		System.out.println("service : valider les RG : " + d);
		return dao.insert(d);
	}

}
