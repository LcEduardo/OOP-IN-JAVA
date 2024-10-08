package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Pirata> piratas = new LinkedList<>();

        // Adicionando Piratas no LinkedList
        piratas.add( new Pirata("Luffy"));
        piratas.add(new Pirata("Zoro"));
        piratas.add(new Pirata("Sanji"));

        // Adicionando Pirata no começo e no fim
        piratas.addFirst(new Pirata("Ussop"));
        piratas.addLast(new Pirata("Shanks"));

        // System.out.println(piratas);
        for (Pirata pirata: piratas){
            System.out.println(pirata);
        }
        // Imprimindo o primeiro Pirata
        System.out.println("\n" + piratas.getFirst() + "\n");

        // Removendo elemento do LinkedList
        piratas.removeLast();
        System.out.println(piratas.getLast());
    }
}
