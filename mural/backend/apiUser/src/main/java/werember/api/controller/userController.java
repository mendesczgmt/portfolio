package werember.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import werember.api.user.DadosAtualizaUser;
import werember.api.user.DadosListagemUsuarios;
import werember.api.user.UserRepository;
import werember.api.user.Usuario;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    private UserRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody werember.api.user.DadosCadastroUser dados) {
      repository.save(new Usuario(dados));
    }

    @GetMapping
    public Page<DadosListagemUsuarios> listar(Pageable paginacao) {
      return repository.findAllByAtivoTrue(paginacao).map(DadosListagemUsuarios::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizaUser dados) {
      Usuario usuario = repository.getReferenceById(dados.id());
      usuario.atualizarDados(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
      Usuario usuario = repository.getReferenceById(id);
      usuario.excluir();
    }

}
