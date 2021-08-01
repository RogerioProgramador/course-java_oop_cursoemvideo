package Aula14.VideoProjetoFInal.Classes;

import Aula14.VideoProjetoFInal.Interfaces.AcoesVideo;

public class Video implements AcoesVideo {
    private String titulo;
    private Integer avaliacao;
    private Integer views;
    private Integer curtidas;
    private boolean reproduzindo;

    //Construtores
    public Video(String titulo) {
        this.titulo =  titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //Métodos especiais
    public void dados() {
        System.out.println("Titulo:" + this.getTitulo());
        System.out.println("Avaliação: " + this.getAvaliacao());
        System.out.println("Vizualizações: " + this.getViews());
        System.out.println("Curtidas: " + this.getCurtidas());
        System.out.println("Reproduzindo: " + this.isReproduzindo());
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        this.curtidas++;
    }


    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video {" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                "}";
    }
}
