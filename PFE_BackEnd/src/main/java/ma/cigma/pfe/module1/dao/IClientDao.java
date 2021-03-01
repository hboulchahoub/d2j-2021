package ma.cigma.pfe.module1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.pfe.module1.models.Client;
/**
 * this interface contains signatures of methods to be called 
 * by the service layer 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Repository
public interface IClientDao extends CrudRepository<Client, Integer>{
}
