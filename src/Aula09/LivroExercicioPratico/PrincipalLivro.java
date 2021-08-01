package Aula09.LivroExercicioPratico;

import Aula09.LivroExercicioPratico.Classes.Livro;
import Aula09.LivroExercicioPratico.Classes.Pessoa;

public class PrincipalLivro {

    public static void main(String[] args) {
        Pessoa[]    p = new Pessoa[2];
        Livro[]     l = new Livro[3];

        p[0] =  new Pessoa("Rogerio", "Masculino", 23);
        p[1] =  new Pessoa("Maria", "Feminino", 25);

        l[0] = new Livro("A grande chance", "GFT", 42354);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 42354, p[0]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 42354, p[1]);

        p[0].fazerAniver();
        l[0].setLeitor(p[0]);
        l[0].folhear(50000);
        System.out.println(l[0].detalhes());
        p[0].dados();

    }
}
