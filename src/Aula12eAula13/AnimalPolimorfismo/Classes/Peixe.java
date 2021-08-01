package Aula12eAula13.AnimalPolimorfismo.Classes;

public class Peixe extends Animal{
    public String corEscamas;

    public void soltarBolhas() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub...");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
