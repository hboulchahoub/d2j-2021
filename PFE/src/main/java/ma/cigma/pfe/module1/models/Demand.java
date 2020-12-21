package ma.cigma.pfe.module1.models;

/**
 * this class is created to contain data introduced by users
 * Objects form this class will persisted in our data base
 * this class must contain only getter, setters, constructors
 * it can also override methods form Object class.
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public class Demand {
	
	private String compte;
	private int nb;

	
	public String getCompte() {
		return compte;
	}

	@Override
	public String toString() {
		return "Demand [compte=" + compte + ", nb=" + nb + "]";
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

}
