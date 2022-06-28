package bankline.api.bankline.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bankline.api.bankline.DTO.NovaMovimentacao;
import bankline.api.bankline.Model.Correntista;
import bankline.api.bankline.Model.Movimentacao;
import bankline.api.bankline.Model.MovimentacaoTipo;
import bankline.api.bankline.Repository.CorrentistaRepository;
import bankline.api.bankline.Repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	@Autowired
	private CorrentistaRepository correntistaRepository;
	private MovimentacaoRepository repository;
	
	public void save(NovaMovimentacao novaMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();
		Double valor = novaMovimentacao.getValor();
		if(novaMovimentacao.getTipo()==MovimentacaoTipo.DESPESA)
			valor= valor*-1;
		
		
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setId(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if(correntista !=null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		repository.save(movimentacao);
		
		
	}

}
