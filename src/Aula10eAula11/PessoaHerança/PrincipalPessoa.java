package Aula10eAula11.PessoaHerança;

import Aula10.PessoaHerança.Classes.*;
import Aula10eAula11.PessoaHerança.Classes.*;

public class PrincipalPessoa {

    public static void main(String[] args) {
        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 =  new Bolsista();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        p5.setNome("Clebin");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        p2.pagarMensalidade();
        p5.pagarMensalidade();
    }
}
