package Scouto.Igor.Trabalho3Locadora.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Scouto.Igor.Trabalho3Locadora.modelo.Filme;


import java.util.ArrayList;
@RestController
public class ControleFilme {

    @GetMapping("filmesDeAcao")
    public ArrayList<Filme> filmesAcao() {
        Filme a1 = new Filme();
        a1.setGenero("Acao");
        a1.setNome("Rambo");
        a1.setTempoFilme(1.50);
        a1.setValor(9);
        a1.setQuantidade(3);
        a1.setValorFinal(a1.calc());

        Filme a2 = new Filme();
        a2.setGenero("Acao");
        a2.setNome("Velozes e Furiosos");
        a2.setTempoFilme(2.10);
        a2.setValor(12);
        a2.setQuantidade(2);
        a2.setValorFinal(a2.calc());

        Filme a3 = new Filme();
        a3.setGenero("Acao");
        a3.setNome("Rollo point");
        a3.setTempoFilme(1.20);
        a3.setValor(5.00);
        a3.setQuantidade(1);
        a3.setValorFinal(a3.calc());

        Filme a4 = new Filme();
        a4.setGenero("Acao");
        a4.setNome("Tropa de Elite");
        a4.setTempoFilme(2.50);
        a4.setValor(12.90);
        a4.setQuantidade(5);
        a4.setValorFinal(a2.calc());

        Filme a5 = new Filme();
        a5.setGenero("Acao");
        a5.setNome("22 Milhas");
        a5.setTempoFilme(1.90);
        a5.setValor(15.00);
        a5.setQuantidade(8);
        a5.setValorFinal(a5.calc());

        ArrayList<Filme> acao = new ArrayList();
        acao.add(a1);
        acao.add(a2);
        acao.add(a3);
        acao.add(a4);
        acao.add(a5);
        return acao;
    }

    @GetMapping("filmesDeFiccao")
    public ArrayList<Filme> filmesFiccao() {
        Filme f1 = new Filme();
        f1.setGenero("ficcao");
        f1.setNome("Homem Aranha 3");
        f1.setTempoFilme(1.80);
        f1.setValor(5.50);
        f1.setQuantidade(4);
        f1.setValorFinal(f1.calc());

        Filme f2 = new Filme();
        f2.setGenero("ficcao");
        f2.setNome("Circulo de Fogo");
        f2.setTempoFilme(1.60);
        f2.setValor(8);
        f2.setQuantidade(2);
        f2.setValorFinal(f2.calc());

        Filme f3 = new Filme();
        f3.setGenero("ficcao");
        f3.setNome("Vingadores End Game");
        f3.setTempoFilme(2.20);
        f3.setValor(25.00);
        f3.setQuantidade(2);
        f3.setValorFinal(f3.calc());

        Filme f4 = new Filme();
        f4.setGenero("ficcao");
        f4.setNome("Narnia");
        f4.setTempoFilme(1.40);
        f4.setValor(5.99);
        f4.setQuantidade(5);
        f4.setValorFinal(f2.calc());

        Filme f5 = new Filme();
        f5.setGenero("ficcao");
        f5.setNome("Homem de Ferro 3");
        f5.setTempoFilme(2.10);
        f5.setValor(20.00);
        f5.setQuantidade(3);
        f5.setValorFinal(f5.calc());

        ArrayList<Filme> ficcao = new ArrayList();
        ficcao.add(f1);
        ficcao.add(f2);
        ficcao.add(f3);
        ficcao.add(f4);
        ficcao.add(f5);
        return ficcao;
    }


}
