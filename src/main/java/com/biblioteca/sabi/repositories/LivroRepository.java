package com.biblioteca.sabi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.sabi.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
	
	
}
