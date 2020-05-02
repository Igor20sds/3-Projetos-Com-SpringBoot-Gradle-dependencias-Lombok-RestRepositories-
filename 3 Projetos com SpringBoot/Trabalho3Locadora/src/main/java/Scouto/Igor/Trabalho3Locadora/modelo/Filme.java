package Scouto.Igor.Trabalho3Locadora.modelo;

import lombok.*;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Filme {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String genero;
    @Getter @Setter
    private double valor;
    @Getter @Setter
    private double quantidade;
    @Getter @Setter
    private double tempoFilme;
    @Getter @Setter
    private double valorFinal;


    public Double calc(){
        return quantidade*valor;
    }

}




    /*




    public String validacaoQuantidade() {
        if (this.quantidade <= 0) {
            return "Quantidade de filmes nao Definida!!";
        }else{
            return "Quantidade de Filmes: "+quantidade;
        }*/
