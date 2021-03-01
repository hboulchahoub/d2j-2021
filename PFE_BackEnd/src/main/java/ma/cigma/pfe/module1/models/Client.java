package ma.cigma.pfe.module1.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nom;
	private String cin;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
	private Set<Demand> demands;
	
	@OneToOne(cascade=CascadeType.PERSIST,mappedBy="client")
	private Detail detail;

}
