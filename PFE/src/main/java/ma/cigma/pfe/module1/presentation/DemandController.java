package ma.cigma.pfe.module1.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.cigma.pfe.module1.models.Demand;
import ma.cigma.pfe.module1.service.IDemandService;

/**
 * this controller will validate user's inputs
 * using hibernate-validators. It will be called
 * by main controller of Spring MVC
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@RequestMapping("/demands")
@Controller
public class DemandController {
	@Autowired
	private IDemandService service;
	@RequestMapping("/home")
	public String home(Model m){
		Demand d = new Demand();
		d.setCompte("A200");
		d.setNb(20);
		m.addAttribute("account", d);
		return "index";
		
	}
	
	@RequestMapping("/add")
	public String insert( @ModelAttribute("account")  Demand d,Model m) {
		System.out.println("Acces method controller");
		service.insertDemand(d);
		m.addAttribute("result", "sucess");
		return "listView";
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
