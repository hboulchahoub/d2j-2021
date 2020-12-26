package ma.cigma.pfe.module1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * this class is created to contain data introduced by users Objects form this
 * class will persisted in our data base this class must contain only getter,
 * setters, constructors it can also override methods form Object class.
 * 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Entity
@Table(name = "TDemands")
public class Demand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Identity = AUTOINCREMENT
	//SEQUENCE = UTILISE UNE SEQUENCE [SEQUNCE SGBD]
	//TABLE = hibernate_sequences
	//AUTO= CHOISIR UNE DES TROIS
	private int id;
	@Column(name="cmp")
	private String compte;
	private int nb;
	@Transient
	int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
