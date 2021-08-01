package Aula07eAula08.UECRelacaoEntreClasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private Integer idade;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private float altura;
    private float peso;
    static private boolean apresentar =  true;

    //Construtores
    public Lutador (String no, String na, Integer id, Integer vi, Integer de, Integer em, float al, float pe) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        this.setAltura(al);
        this.setPeso(pe);
    };



    //Métodos
    public void apresentar() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + getIdade() + " anos e " + getAltura() + "m de altura" );
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println("Com um cartel de " + this.getVitorias() + " vitória(s), " + this.getDerrotas() + " derrota(s) e " + this.getEmpates() + " empate(s)!");
        System.out.println("Apresentamos o lutador " + this.getNome().toUpperCase() + "!!!");
    };

    public void status () {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("ganhou " + this.getVitorias() + " vezes");
        System.out.println("perdeu " + this.getDerrotas() + " vezes");
        System.out.println("empatou " + this.getEmpates() + " vezes");
    };

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }



    //Getters and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2 ) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.9) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
}
