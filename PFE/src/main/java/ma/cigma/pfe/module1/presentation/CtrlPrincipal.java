package ma.cigma.pfe.module1.presentation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.module1.models.Demand;
/**
 * this main controller will be removed and replaced by
 * DispatcherServelet of Spring MVC
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public class CtrlPrincipal {
	
	static ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	static DemandController ctrlDemande=(DemandController)context.getBean("ctrl");
	
	public static void main(String[] args) {
		// Recuperer les donnees de user
		Scanner s = new Scanner(System.in);
		System.out.println("Saisir un code");
		String code= s.nextLine();
		System.out.println("Saisir un nb");
		int nb=s.nextInt();
		// construire l'objet
		Demand d= new Demand();
		d.setCompte(code);
		d.setNb(nb);
		// dispatcher vers le controleur
		String action="/add";
		if(action.equals("/add")) {
			ctrlDemande.insert(d);
		}
	}
}
