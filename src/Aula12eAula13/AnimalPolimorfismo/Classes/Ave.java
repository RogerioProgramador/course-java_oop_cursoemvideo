package Aula12eAula13.AnimalPolimorfismo.Classes;

public class Ave extends Animal{
    public String corPena;

    public void fazerNinho() {
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu Piu");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
