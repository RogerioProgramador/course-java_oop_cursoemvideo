package Aula10eAula11.PessoaHerança.Classes;

public class Tecnico extends Aluno{
    public String registroPro;


    public void praticar() {
        System.out.println("Praticando " + this.registroPro);
    }

    public String getRegistroPro() {
        return registroPro;
    }

    public void setRegistroPro(String registroPro) {
        this.registroPro = registroPro;
    }
}
