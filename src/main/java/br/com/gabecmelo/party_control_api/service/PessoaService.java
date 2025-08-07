package br.com.gabecmelo.party_control_api.service;

import br.com.gabecmelo.party_control_api.model.Pessoa;
import br.com.gabecmelo.party_control_api.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repo;

    public PessoaService(PessoaRepository repo) {
        this.repo = repo;
    }

    public Pessoa register(Pessoa p) {
        if (p.getIdade() >= 18) {
            return repo.save(p);
        }
        return null;
    }

    public List<Pessoa> findAll() {
        return repo.findAll();
    }
}
