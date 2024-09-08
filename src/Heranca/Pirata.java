package Heranca;

public class Pirata extends Personagem {
    private String navio;

    public Pirata(String nome, int idade, String navio) {
        super(nome, idade);
        this.navio = navio;
    }

    public String getNavio() {
        return navio;
    }

    public void setNavio(String navio) {
        this.navio = navio;
    }
}