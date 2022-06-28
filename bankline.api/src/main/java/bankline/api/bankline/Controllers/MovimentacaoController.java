package bankline.api.bankline.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankline.api.bankline.DTO.NovaMovimentacao;


import bankline.api.bankline.Model.Movimentacao;

import bankline.api.bankline.Repository.MovimentacaoRepository;

import bankline.api.bankline.Service.MovimentacaoService;


@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
		}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}
	 @GetMapping("/{idConta}")
		public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
			return repository.findByIdConta(idConta);
		}
}
