package Aula07eAula08.UECRelacaoEntreClasses;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private boolean aprovada;

    public void  marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            System.out.println("LUTA APROVADA!!");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("LUTA ENTRE " + l1.getNome().toUpperCase() +
                    " E " + l2.getNome().toUpperCase() + " REPROVADA!!");
            System.out.println("------------------------------------------------------------------------");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    };

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            var aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("------------------------------------------------------------------------");
            if (vencedor == 0) {
                System.out.println(this.desafiado.getNome() + " e " + this.desafiante.getNome() + " EMPATARAM!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            } else if (vencedor == 1) {
                System.out.println(this.desafiado.getNome() + " VENCE A LUTA!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else if (vencedor == 2) {
                System.out.println(this.desafiante.getNome() + " VENCE A LUTA!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            }
        }


    };

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
