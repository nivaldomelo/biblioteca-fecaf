package br.com.biblioteca.controller;

import br.com.biblioteca.model.Emprestimo;
import br.com.biblioteca.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> listarTodos() {
        return emprestimoService.listarTodos();
    }

    @PostMapping
    public Emprestimo salvar(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.salvar(emprestimo);
    }

    @GetMapping("/{id}")
    public Optional<Emprestimo> buscarPorId(@PathVariable Long id) {
        return emprestimoService.buscarPorId(id);
    }

    @PutMapping("/{id}/devolucao")
    public void registrarDevolucao(@PathVariable Long id) {
        emprestimoService.registrarDevolucao(id);
    }
}

