package Array;

public class Array {
    public static void main(String[] args) {

        String[] nomesPiratas = new String[3];

        Pirata luffy = new Pirata("Luffy", 19, "Going Merry");
        Pirata zoro = new Pirata("Zoro", 21, "Going Merry");
        Pirata sanji = new Pirata("Sanji", 23, "Going Merry");

        nomesPiratas[0] = luffy.getNome();
        nomesPiratas[1] = zoro.getNome();
        nomesPiratas[2] = sanji.getNome();

        for (String nomes: nomesPiratas){
            System.out.println(nomes);
        }
    }
}
