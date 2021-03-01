package ma.cigma.pfe.module1.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Embeddable
public class AccountId implements Serializable{
	
	private String number;
	private String type;
	public AccountId() {
	}
	
	@Override
	public int hashCode() {
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
