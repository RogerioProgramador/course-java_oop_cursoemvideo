package Aula14.VideoProjetoFInal.Classes;

public class Gafanhoto extends Pessoa{
    private String login;
    private Integer totAssistido;

    //Construtores
    public Gafanhoto(String nome, String sexo, Integer idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    //Métodos especiais
    public void viuMaisUm() {
        this.totAssistido++;
    }


    //Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", experiencia=" + experiencia +
                '}';
    }
}
