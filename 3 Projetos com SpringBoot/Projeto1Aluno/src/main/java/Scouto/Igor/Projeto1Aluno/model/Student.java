package Scouto.Igor.Projeto1Aluno.model;
import lombok.*;

/*
* @author   Igor Scouto dos Santos
* @since    30/04/2020
* @version  1.0
* */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int room;
    @Getter @Setter
    private int registration;

}
