package Aula10eAula11.PessoaHerança.Classes;

public class Aluno extends Pessoa{
    private Integer matr;
    private String curso;

    //Métodos
    public final void cancelarMatr() {
        System.out.println("Matrícula de " + this.nome + " será cancelada");
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade de " + this.nome + " foi paga");
    }

    //Getters and Setters
    public Integer getMatr() {
        return matr;
    }

    public void setMatr(Integer matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
