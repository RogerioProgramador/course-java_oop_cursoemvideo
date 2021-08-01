package Aula12eAula13.AnimalPolimorfismo.Classes;

public abstract class Animal {
    protected float peso;
    protected Integer idade;
    protected Integer membros;

    //Métodos especiais abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();


    //Getters e Setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }
}
