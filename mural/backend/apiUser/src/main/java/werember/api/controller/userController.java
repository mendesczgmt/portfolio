package werember.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import werember.api.user.DadosCadastroUser;

@RestController
@RequestMapping("/user")
public class userController {
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroUser dados) {
        System.out.println(dados);
    }

}
