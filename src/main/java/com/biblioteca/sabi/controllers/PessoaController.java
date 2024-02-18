package com.biblioteca.sabi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.sabi.Pessoa;
import com.biblioteca.sabi.repositories.PessoaRepository;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/{id}")
    public Optional<Pessoa> getPessoaById(@PathVariable int id) {
        return pessoaRepository.findById(id);
    }

    @GetMapping
    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoa updatePessoa(@PathVariable int id, @RequestBody Pessoa pessoaDetails) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada com id: " + id));
        pessoa.setNome(pessoaDetails.getNome());
        pessoa.setMatricula(pessoaDetails.getMatricula());
        pessoa.setEmail(pessoaDetails.getEmail());
        pessoa.setCpf(pessoaDetails.getCpf());
        pessoa.setTipoUsuario(pessoaDetails.getTipoUsuario());
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable int id) {
        pessoaRepository.deleteById(id);
    }
}
