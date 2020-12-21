package ma.cigma.pfe.module1.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.module1.models.Demand;
import ma.cigma.pfe.module1.service.IDemandService;

/**
 * this controller will validate user's inputs
 * using hibernate-validators. It will be called
 * by main controller of Spring MVC
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Controller
public class DemandController {
	@Autowired
	private IDemandService service;

	public void insert(Demand d) {
		service.insertDemand(d);
	}
	public void update(Demand d) {
		service.updateDemand(d);
	}
	public void delete(Demand d) {
		service.deleteDemand(d);
	}
	public void select(Demand d) {
		service.selectDemand(d);
	}

}
