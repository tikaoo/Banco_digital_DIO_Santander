package bankline.api.bankline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bankline.api.bankline.Model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
	

}
