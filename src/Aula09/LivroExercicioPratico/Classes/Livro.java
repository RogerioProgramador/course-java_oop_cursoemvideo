package Aula09.LivroExercicioPratico.Classes;

import Aula09.LivroExercicioPratico.Interfaces.Publicacao;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtores
    public Livro(String titulo, String autor, Integer totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = null;
    }

    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //Métodos
    public String detalhes() {
        return "Título: " + this.getTitulo() +
                "\nAutor: " + this.getAutor() +
                "\nPáginas: " + this.getTotPaginas() +
                "\nPágina atual: " + this.getPagAtual() +
                "\nAberto: " + this.isAberto() +
                "\nLeitor: " + this.getLeitor().getNome();
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(Integer p) {
        if (p < this.getTotPaginas() || p < 0)
            this.setPagAtual(p);
        else
            System.out.println("Página inexistente");
    }

    @Override
    public void avancarPag() {
        if (getPagAtual() < getTotPaginas())
            this.setPagAtual(getPagAtual() + 1);
        else
            System.out.println("Não é possivel avançar mais.");
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() > 0)
            this.setPagAtual(getPagAtual() - 1);
        else
            System.out.println("Não é possivel voltar mais.");
    }
}
