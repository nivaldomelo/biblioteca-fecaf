package br.com.biblioteca.repository;


import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}

