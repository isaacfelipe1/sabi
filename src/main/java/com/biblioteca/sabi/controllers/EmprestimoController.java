package com.biblioteca.sabi.controllers;

import com.biblioteca.sabi.Emprestimo;
import com.biblioteca.sabi.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @GetMapping("/{id}")
    public Optional<Emprestimo> getEmprestimoById(@PathVariable int id) {
        return emprestimoRepository.findById(id);
    }

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoRepository.findAll();
    }

    @PostMapping
    public Emprestimo createEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    @PutMapping("/{id}")
    public Emprestimo updateEmprestimo(@PathVariable int id, @RequestBody Emprestimo emprestimoDetails) {
        Emprestimo emprestimo = emprestimoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Emprestimo não encontrado com id: " + id));

        
        emprestimo.setDataEmprestimo(emprestimoDetails.getDataEmprestimo());
        emprestimo.setDataDevolucao(emprestimoDetails.getDataDevolucao());
        emprestimo.setStatus(emprestimoDetails.getStatus());
        emprestimo.setPessoa(emprestimoDetails.getPessoa());
        emprestimo.setLivro(emprestimoDetails.getLivro());
        emprestimo.setComprovante(emprestimoDetails.getComprovante());

        return emprestimoRepository.save(emprestimo);
    }

    @DeleteMapping("/{id}")
    public void deleteEmprestimo(@PathVariable int id) {
        emprestimoRepository.deleteById(id);
    }
}

