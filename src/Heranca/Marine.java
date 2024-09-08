package Heranca;

public class Marine extends Personagem {
    private String patente;

    public Marine(String nome, int idade, String patente) {
        super(nome, idade);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
