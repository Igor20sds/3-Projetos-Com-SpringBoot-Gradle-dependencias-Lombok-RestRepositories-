package Scouto.Igor.Trabalho3Locadora.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleBoasVindas {
    @GetMapping("/")
    public String mensagem(){
        return "Ola Bem Vindo a nossa Locadora ";
    }
}
