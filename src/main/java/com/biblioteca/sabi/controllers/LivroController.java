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

import com.biblioteca.sabi.Livro;
import com.biblioteca.sabi.repositories.LivroRepository;

@RestController
@RequestMapping(value="/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    // Endpoint para obter todos os livros
    @GetMapping
    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    // Endpoint para obter um livro pelo ID
    @GetMapping("/{id}")
    public Livro getLivroById(@PathVariable Integer id) {
        Optional<Livro> livroOptional = livroRepository.findById(id);
        return livroOptional.orElse(null); // Retorna null se o livro não for encontrado
    }

    // Endpoint para adicionar um novo livro
    @PostMapping
    public Livro addLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    // Endpoint para atualizar um livro existente
    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Integer id, @RequestBody Livro livroDetails) {
        Optional<Livro> livroOptional = livroRepository.findById(id);
        if (livroOptional.isPresent()) {
            Livro livro = livroOptional.get();
            livro.setNome(livroDetails.getNome());
            return livroRepository.save(livro);
        } else {
            return null; // Retorna null se o livro não for encontrado
        }
    }

    // Endpoint para excluir um livro
    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Integer id) {
        livroRepository.deleteById(id);
    }
}
