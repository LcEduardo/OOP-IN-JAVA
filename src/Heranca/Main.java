package Heranca;

public class Main {
    public static void main(String[] args){

        Pirata luffy = new Pirata("Luffy", 19, "Going Merry");
        Marine garp = new Marine("Garp", 76, "Vice-Admiral");

        // Acessando métodos herdados da classe Personagem
        System.out.println(luffy.getNome()); // Luffy
        System.out.println(garp.getIdade()); // 76

        // Acessando atributos específicos de Pirata e Marine
        System.out.println(luffy.getNavio()); // Going Merry
        System.out.println(garp.getPatente()); // Vice-Admiral

        // Personagem não pode acessar diretamente navio ou patente
        // Exemplo: luffy.getPatente() não é válido
    }
}
