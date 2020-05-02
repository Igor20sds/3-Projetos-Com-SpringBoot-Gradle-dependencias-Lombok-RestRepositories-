package Scouto.Igor.Projeto2Canil.modelo;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Canil {
    @Getter @Setter
    private String raca;
    @Getter @Setter
    private String sexo;
    @Getter @Setter
    private String porte;
    @Getter @Setter
    private String idade;
}
