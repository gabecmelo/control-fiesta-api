package br.com.gabecmelo.party_control_api.repository;

import br.com.gabecmelo.party_control_api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
