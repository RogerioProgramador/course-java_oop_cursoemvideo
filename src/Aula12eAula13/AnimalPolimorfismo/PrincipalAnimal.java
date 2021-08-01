package Aula12eAula13.AnimalPolimorfismo;


import Aula12.AnimalPolimorfismo.Classes.*;
import Aula12.AnimalPolimorfismo.Classes.Mamiferos.*;
import Aula12eAula13.AnimalPolimorfismo.Classes.Ave;
import Aula12eAula13.AnimalPolimorfismo.Classes.Mamiferos.Cachorro;
import Aula12eAula13.AnimalPolimorfismo.Classes.Mamiferos.Canguru;
import Aula12eAula13.AnimalPolimorfismo.Classes.Mamífero;
import Aula12eAula13.AnimalPolimorfismo.Classes.Peixe;
import Aula12eAula13.AnimalPolimorfismo.Classes.Reptil;

public class PrincipalAnimal {

    public static void main(String[] args) {
        //    Animal n = new Animal();
        Mamífero m = new Mamífero();
        Reptil r = new Reptil();
        Peixe p =  new Peixe();
        Ave a = new Ave();
        Canguru c =  new Canguru();
        Cachorro k =  new Cachorro();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println();
        p.setPeso(85.3f);
        p.setIdade(2);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolhas();
        System.out.println();
        a.setPeso(85.3f);
        a.setIdade(2);
        a.setMembros(0);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println();
        c.setPeso(85.3f);
        c.setIdade(2);
        c.setMembros(0);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println();
        k.setPeso(85.3f);
        k.setIdade(2);
        k.setMembros(0);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();
        k.reagir("Olá");
        k.reagir("Vai apanhar!");
        k.reagir(true);
    }


}
