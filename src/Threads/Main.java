package Threads;

public class Main {
    public static void main(String[] args) {

        Corredor c1 = new Corredor ("Penelope Charmosa");
        Corredor c2 = new Corredor ("Peter Perfeito");
        Corredor c3 = new Corredor ("Dick Vigarista");
        Corredor c4 = new Corredor ("Barão Vermelho");

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);

        System.out.println("****** Largada ******");

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        /*
        c1.run();
        c2.run();
        c3.run();
        c4.run();
        */
    }
}
