package Aula10eAula11.PessoaHerança.Classes;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    //Construtores

    public Professor() {}
    public Professor(String especialidade, float salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //Métodos especiais
    public void receberAum(float s) {
        this.setSalario(getSalario() + s);
    }

    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
