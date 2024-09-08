package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Cria uma instância da classe 'Luffy', mas o tipo de referência é 'Personagem'.
        // Isso demonstra o uso de polimorfismo, onde um objeto da classe derivada ('Luffy')
        // é referenciado por uma variável do tipo da classe base ('Personagem').
        Personagem luffy = new Luffy();
        luffy.ataque();

        Personagem zoro = new Zoro();
        zoro.ataque();
    }
}
