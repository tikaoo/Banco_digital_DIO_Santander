package bankline.api.bankline.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bankline.api.bankline.DTO.NovoCorrentista;
import bankline.api.bankline.Model.Conta;
import bankline.api.bankline.Model.Correntista;
import bankline.api.bankline.Repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository repository;
		public void save(NovoCorrentista novoCorrentista) {
			Correntista correntista = new Correntista();
			correntista.setCpf(novoCorrentista.getCpf());
			correntista.setNome(novoCorrentista.getNome());
			
			Conta conta = new Conta();
			conta.setSaldo(0.0);
			conta.setNumero(new Date().getTime());
			
			correntista.setConta(conta);
			repository.save(correntista);
		}
}
