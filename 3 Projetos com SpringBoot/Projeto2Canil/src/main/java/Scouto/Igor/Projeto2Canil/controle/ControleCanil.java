package Scouto.Igor.Projeto2Canil.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Scouto.Igor.Projeto2Canil.modelo.Canil;

import java.util.ArrayList;

@RestController
public class ControleCanil {
    @GetMapping("listaCaes")
    public ArrayList<Canil> getListaCaes(){
        Canil cao1 = new Canil();
        cao1.setRaca("Pitbull");
        cao1.setSexo("Femea");
        cao1.setPorte("Pequeno");
        cao1.setIdade("2 Meses");
        Canil cao2 = new Canil();
        cao2.setRaca("Vira Lata");
        cao2.setSexo("Macho");
        cao2.setPorte("Medio");
        cao2.setIdade("3 Anos");
        Canil cao3 = new Canil();
        cao3.setRaca("Pug");
        cao3.setSexo("Femea");
        cao3.setPorte("Pequeno");
        cao3.setIdade("8 Meses");
        Canil cao4 = new Canil();
        cao4.setRaca("Chow-Chow");
        cao4.setSexo("Macho");
        cao4.setPorte("Grande");
        cao4.setIdade("2 Meses");
        Canil cao5 = new Canil();
        cao5.setRaca("Chihuahua");
        cao5.setSexo("Macho");
        cao5.setPorte("Bem Pequeno");
        cao5.setIdade("5 Anos");

        ArrayList<Canil> listaCaes = new ArrayList<>();
        listaCaes.add(cao1);
        listaCaes.add(cao2);
        listaCaes.add(cao3);
        listaCaes.add(cao4);
        listaCaes.add(cao5);

        return listaCaes;
    }
    @GetMapping("listaGatos")
    public ArrayList<Canil> getListaGatos(){
        Canil gato1 = new Canil();
        gato1.setRaca("Noruegues da Floresta");
        gato1.setSexo("Femea");
        gato1.setPorte("Grande");
        gato1.setIdade("2 anos");

        Canil gato2 = new Canil();
        gato2.setRaca("Siames");
        gato2.setSexo("Macho");
        gato2.setPorte("Pequeno");
        gato2.setIdade("2 Meses");

        Canil gato3 = new Canil();
        gato3.setRaca("Persa");
        gato3.setSexo("Femea");
        gato3.setPorte("Medio");
        gato3.setIdade("3 Anos");

        Canil gato4 = new Canil();
        gato4.setRaca("Munchkin");
        gato4.setSexo("Femea");
        gato4.setPorte("Pequeno");
        gato4.setIdade("5 Meses");

        Canil gato5 = new Canil();
        gato5.setRaca("Ocicat");
        gato5.setSexo("Macho");
        gato5.setPorte("Pequeno");
        gato5.setIdade("8 Meses");

        ArrayList<Canil> listaGatos = new ArrayList<>();
        listaGatos.add(gato1);
        listaGatos.add(gato2);
        listaGatos.add(gato3);
        listaGatos.add(gato4);
        listaGatos.add(gato5);

        return listaGatos;
    }

}
