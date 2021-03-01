package ma.cigma.pfe.module1.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Moral extends Client{

	private String rc;
	private String patente;

}
