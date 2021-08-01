package Aula14.VideoProjetoFInal;

import Aula14.VideoProjetoFInal.Classes.Gafanhoto;
import Aula14.VideoProjetoFInal.Classes.Video;
import Aula14.VideoProjetoFInal.Classes.Visualizacao;

public class MainVideo {

    public static void main(String[] args) {
        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F" , 12,"creuzita");

        Visualizacao vis = new Visualizacao(g[0], v[1]);
        Visualizacao visu = new Visualizacao(g[0], v[1]);
        visu.avaliar(3);
        vis.avaliar(3);
        System.out.println(v[1].toString());

    }
}
