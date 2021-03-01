package ma.cigma.pfe.module1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.cigma.pfe.module1.dao.IClientDao;
import ma.cigma.pfe.module1.models.Client;

/**
 * this class is created to validate all rules related to 
 * business logic
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
@Service
@Transactional
public class ClientServiceImpl implements IClientService {
	@Autowired
	private IClientDao dao;

	@Override
	public Client insertClient(Client d) {
		return dao.save(d);
	}

	@Override
	public Client updateClient(Client d) {
		Client old= dao.findById(d.getId()).get();
		old.setCin(d.getCin());
		old.setNom(d.getNom());
		return dao.save(old);
	}

	@Override
	public void deleteClient(int id) {
		 dao.deleteById(id);
	}

	@Override
	public Client selectClientById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Client> selectAll() {
		return (List<Client>) dao.findAll();
	}

}
