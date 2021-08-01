package Aula10eAula11.PessoaHerança.Classes;

public class Bolsista extends Aluno{
    public boolean bolsa;

    //Métodos especiais
    public void renovarBolsa() {
        this.bolsa = true;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! pagamento facilitado.");
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
}
