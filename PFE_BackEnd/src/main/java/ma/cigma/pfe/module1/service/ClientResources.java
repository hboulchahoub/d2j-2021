package ma.cigma.pfe.module1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.cigma.pfe.module1.models.Client;

@RequestMapping("/api/clts")
@RestController
public class ClientResources {
	@Autowired
	private IClientService service;
	
	@GetMapping(path="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Client>getAll() {
		return service.selectAll();
	}
	@GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Client getOne(@PathVariable("id") int id) {
		return service.selectClientById(id);
	}
	@PostMapping(path="/create",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Client add( @RequestBody Client c) {
		return service.insertClient(c);
	}
	@PutMapping(path="/update",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Client update( @RequestBody Client c) {
		return service.updateClient(c);
	}
	@DeleteMapping(path="/{id}")
	public void deleteOne(@PathVariable("id") int id) {
		service.deleteClient(id);
	}}
