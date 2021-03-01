package ma.cigma.pfe.module1.service;

import java.util.List;

import ma.cigma.pfe.module1.models.Client;
/**
 * this interface contains signatures of methods to be called 
 * by the controllers (presentation layer)
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IClientService {
	Client insertClient(Client d);
	Client updateClient(Client d);
	void deleteClient(int id);
	public Client selectClientById(int id);
	public List<Client> selectAll();
}
