package werember.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tarefas")
public class tarefasController {
    
    @GetMapping
    public String teste() {
        return "Hello";
    }
}
