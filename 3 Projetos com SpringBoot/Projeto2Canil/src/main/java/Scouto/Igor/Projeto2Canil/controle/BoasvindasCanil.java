package Scouto.Igor.Projeto2Canil.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoasvindasCanil {
    @GetMapping("/")
    public String mensagem(){
        return  "Ola Bem Vindo ao NOSSO Canil!!";
    }
}
