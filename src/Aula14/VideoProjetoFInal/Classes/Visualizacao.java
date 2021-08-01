package Aula14.VideoProjetoFInal.Classes;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto g, Video v) {
        this.espectador = g;
        this.filme = v;
        v.setViews(v.getViews() + 1);
        g.viuMaisUm();
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int Nota) {
        this.filme.setAvaliacao(Nota);
    }

    public void avaliar(float porc) {
        float nota = porc/100 * 10;
        this.filme.setAvaliacao((int) nota);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "\nespectador=" + espectador +
                ",\n filme=" + filme +
                '}';
    }
}
