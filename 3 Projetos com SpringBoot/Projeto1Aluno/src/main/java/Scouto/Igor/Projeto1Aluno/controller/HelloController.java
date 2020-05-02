package Scouto.Igor.Projeto1Aluno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String message(){
        return "Ola Bem vindo ao Registro de Alunos";
    }
}
