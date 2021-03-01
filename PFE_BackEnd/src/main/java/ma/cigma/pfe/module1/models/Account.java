package ma.cigma.pfe.module1.models;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Account {
	@EmbeddedId
	AccountId id;
	
	
	
	private double montant;

}
