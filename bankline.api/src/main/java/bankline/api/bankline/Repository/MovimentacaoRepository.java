package bankline.api.bankline.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bankline.api.bankline.Model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
	
	public List<Movimentacao> findByIdConta(Integer idConta);

}
