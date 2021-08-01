package Aula12eAula13.AnimalPolimorfismo.Classes;

public class Reptil extends Animal{
    public String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
