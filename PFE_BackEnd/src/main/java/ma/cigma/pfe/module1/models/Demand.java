package ma.cigma.pfe.module1.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@Setter
@ToString
public class Demand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="cmp")
	private String compte;
	private int nb;
	@Transient
	int age;
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	private Client client;
}
