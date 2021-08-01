package Aula10eAula11.PessoaHerança.Classes;

public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected Integer idade;

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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
