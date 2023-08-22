package werember.api.controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
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
      return repository.findAll(paginacao).map(DadosListagemUsuarios::new);
    }

}
