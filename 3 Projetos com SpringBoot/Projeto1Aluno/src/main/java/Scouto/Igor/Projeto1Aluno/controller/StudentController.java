package Scouto.Igor.Projeto1Aluno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Scouto.Igor.Projeto1Aluno.model.Student;
import java.util.ArrayList;

@RestController
public class StudentController {
    @GetMapping ("/listaAlunos")
    public ArrayList<Student> getListaStudent(){
        Student student1 = new Student();
        student1.setName("Joao");
        student1.setRoom(103);
        student1.setRegistration(123456);

        Student student2 = new Student();
        student2.setName("Maria");
        student2.setRoom(102);
        student2.setRegistration(654321);

        Student student3 = new Student();
        student3.setName("Pedro");
        student3.setRoom(103);
        student3.setRegistration(10203040);

        Student student4 = new Student();
        student4.setName("Clerosvaldo");
        student4.setRoom(101);
        student4.setRegistration(21324354);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        return list;

    }
}
