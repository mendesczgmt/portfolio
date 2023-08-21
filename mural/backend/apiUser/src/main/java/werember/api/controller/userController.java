package werember.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import werember.api.user.DadosCadastroUser;
import werember.api.user.UserRepository;
import werember.api.user.Usuario;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    private UserRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroUser dados) {
      repository.save(new Usuario(dados));
    }

}
