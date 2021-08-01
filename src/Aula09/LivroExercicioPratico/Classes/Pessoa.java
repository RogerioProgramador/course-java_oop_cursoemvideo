package Aula09.LivroExercicioPratico.Classes;

public class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    //Construtores
    public Pessoa(String nome, String sexo, Integer idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    //Métodos
    public void fazerAniver() {
        this.setIdade(getIdade() + 1);
        System.out.println("Feliz aniversário de " + getIdade() + " anos!");
    }

    public void dados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Idade: " + this.getIdade());
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
