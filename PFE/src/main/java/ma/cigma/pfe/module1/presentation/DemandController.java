package ma.cigma.pfe.module1.presentation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.module1.models.Demand;
import ma.cigma.pfe.module1.service.IDemandService;

public class DemandController {
	// FAIRE passer l'objet à la couche service
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	static private IDemandService service = (IDemandService) context.getBean("service");

	public static void main(String[] args) {
		// Recuperer les donnees saisies par le
		// user
		Scanner s = new Scanner(System.in);
		System.out.println("Donner un compte");
		String compte = s.nextLine();
		System.out.println("Donner un nb");
		String nb = s.nextLine();
		// convertir les données en objet model
		Demand d = new Demand();
		d.setCompte(compte);
		d.setNb(Integer.parseInt(nb));
		// FAIRE passer l'objet à la couche service
		service.insertDemand(d);
	}

}
