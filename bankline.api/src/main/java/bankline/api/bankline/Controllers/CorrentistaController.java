package bankline.api.bankline.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankline.api.bankline.DTO.NovoCorrentista;
import bankline.api.bankline.Model.Correntista;
import bankline.api.bankline.Repository.CorrentistaRepository;
import bankline.api.bankline.Service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
		}
	
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
	}
	
}