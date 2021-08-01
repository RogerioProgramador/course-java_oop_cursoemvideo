package Aula12eAula13.AnimalPolimorfismo.Classes;

public class Mamífero extends Animal{
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo...");;
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");;
    }

    @Override
    public String toString() {
        return "Mamífero{" +
                "corPelo='" + corPelo + '\'' +
                '}';
    }
}
