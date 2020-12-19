package ma.cigma.pfe.module1.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.module1.dao.IDemandDao;
import ma.cigma.pfe.module1.models.Demand;

public class DemandServiceImpl implements IDemandService {

	// FAIRE passer l'objet à la couche service
	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private IDemandDao dao = (IDemandDao) context.getBean("dao");

	@Override
	public boolean insertDemand(Demand d) {
		System.out.println("service : valider les RG : " + d);
		return dao.insert(d);
	}

}
