package Aula06.ControleEncapsulamento;

public class ControleRemoto implements Controlador {
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    //Construtores
    public ControleRemoto() {
       setVolume(50);
       setLigado(false);
       setTocando(false);
    }

    //Getters and Setters
    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("MENU---------------------------");
            System.out.println("Ligado: " + isLigado());
            System.out.println("Tocando: " + isTocando());
            System.out.printf("Volume: " + getVolume() + " ");
            System.out.printf("[");
            for (int i = 0; i < this.getVolume(); i += 5)
                System.out.printf("|");
            for (int i = this.getVolume(); i < 100; i += 5)
                System.out.printf(" ");
            System.out.printf("]\n");
        } else {
            System.out.println("TV desligada, impossível mostrar menu.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("TV desligada, impossível fechar menu.");
        }

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir...");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar...");
        }
    }
}
