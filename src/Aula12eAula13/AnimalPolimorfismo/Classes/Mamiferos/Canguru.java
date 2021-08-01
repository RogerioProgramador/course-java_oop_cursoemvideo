package Aula12eAula13.AnimalPolimorfismo.Classes.Mamiferos;

import Aula12eAula13.AnimalPolimorfismo.Classes.Mamífero;

public class Canguru extends Mamífero {

    public void usarBolsa() {
        System.out.println("usando bolsa...");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando...");
    }
}
