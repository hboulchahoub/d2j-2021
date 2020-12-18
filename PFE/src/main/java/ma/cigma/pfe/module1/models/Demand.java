package ma.cigma.pfe.module1.models;

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
