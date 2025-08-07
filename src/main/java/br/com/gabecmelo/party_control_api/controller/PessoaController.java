package br.com.gabecmelo.party_control_api.controller;

import br.com.gabecmelo.party_control_api.model.Pessoa;
import br.com.gabecmelo.party_control_api.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public Pessoa register(@RequestBody Pessoa pessoa) {
        if (pessoa.getIdade() < 18) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Idade mínima para participar da festa é de 18 anos."
            );
        }
        return service.register(pessoa);
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return service.findAll();
    }
}
