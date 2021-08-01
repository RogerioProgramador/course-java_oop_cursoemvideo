package Aula12eAula13.AnimalPolimorfismo.Classes.Mamiferos;

import Aula12eAula13.AnimalPolimorfismo.Classes.Mamífero;

public class Cachorro extends Mamífero {

    public void reagir(String s) {
        if (s.equals("toma comida") || s.equals("Olá"))
            System.out.println("Abanar e Latir");
        else
            System.out.println("Rosnar");
    }

    public void reagir(int hora) {
        if (hora < 12)
            System.out.println("Abanar");
        else if (hora >= 18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar e Latir");
    }

    public void reagir(boolean dono) {
        if (dono)
            System.out.println("Abanar");
        else
            System.out.println("Rosnar e Latir");
    }

    public void reagir(int idade, float peso) {
        if (idade < 5)
        {
            if (peso < 10)
                System.out.println("Abanar");
            else
                System.out.println("Latir");
        }
        else
        {
            if (peso < 10)
                System.out.println("Rosnar");
            else
                System.out.println("Ignorar");
        }
    }

    public void enterrarOsso() {
        System.out.println("Enterrou osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
