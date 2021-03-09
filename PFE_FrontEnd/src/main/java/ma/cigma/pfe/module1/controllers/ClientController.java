package ma.cigma.pfe.module1.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ma.cigma.pfe.module1.models.ClientDTO;

@Controller
@RequestMapping("/clients")
public class ClientController {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String urlApi = "http://localhost:8080/backend/api";

	@RequestMapping("/home")
	public String home(Model m, @ModelAttribute("client") ClientDTO clt) {
		List<ClientDTO> list = restTemplate.getForObject(urlApi + "/clts/all", List.class);
		m.addAttribute("list", list);
		ClientDTO dto = clt == null ? new ClientDTO() : clt;
		m.addAttribute("client", dto);
		return "indexClt";
	}

	@RequestMapping(path="/crud", params="add")
	public String insert(@ModelAttribute("client") ClientDTO dto, RedirectAttributes ra) {
		ClientDTO clt = restTemplate.postForObject(urlApi + "/clts/create", dto, ClientDTO.class);
		ra.addFlashAttribute("client", clt);
		return "redirect:/clients/home";
	}
	
	@RequestMapping(path="/crud",params="update")
	public String update(@ModelAttribute("client") ClientDTO dto, RedirectAttributes ra) {
		restTemplate.put(urlApi + "/clts/update", dto, ClientDTO.class);
		ra.addFlashAttribute("client", dto);
		return "redirect:/clients/home";
	}
	
	@RequestMapping(path="/update/{id}")
	public String edit(@PathVariable("id") int id,RedirectAttributes ra) {
		ClientDTO dto = restTemplate.getForObject(urlApi + "/clts/"+id, ClientDTO.class);
		ra.addFlashAttribute("client", dto);
		return "redirect:/clients/home";
	}
	
	@RequestMapping(path="/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		restTemplate.delete(urlApi + "/clts/"+id);
		return "redirect:/clients/home";
	}

	
	

}
