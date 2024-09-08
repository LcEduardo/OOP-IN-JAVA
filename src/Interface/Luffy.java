package Interface;

public class Luffy extends Personagem implements Fruta {
    // Construtor da classe 'Luffy' que chama o construtor da superclasse 'Personagem'.
    public Luffy(String nome, int idade) {
        super(nome, idade);
    }

    // Implementação do método 'qualFruta' da interface 'Fruta'.
    @Override
    public void qualFruta() {
        System.out.println("Luffy tem a Gomu-gomu no Mi");
    }
}
