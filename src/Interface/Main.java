package Interface;

public class Main {
    public static void main(String[] args){
        // Se eu instanciar com Personagem eu não recebo acesso a interface
        Luffy luffy = new Luffy("Luffy", 19);
        System.out.println(luffy.getNome());
        luffy.qualFruta();
    }
}
