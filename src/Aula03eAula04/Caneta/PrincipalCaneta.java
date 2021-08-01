package Aula03eAula04.Caneta;

public class PrincipalCaneta {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta("BIC", "Verde", 0.5f, true);

        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.setCor("Azul");
        c1.setTampada(true);
        c1.status();
        System.out.println("");
        c2.destampar();
        c2.status();
    }

}
