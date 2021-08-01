package Aula03eAula04.Caneta;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    //Constructors
    public Caneta () {}
    public Caneta(String m, String c, float p, boolean t) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampada = t;
    }

    //Methods
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("tampada: " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    //Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
