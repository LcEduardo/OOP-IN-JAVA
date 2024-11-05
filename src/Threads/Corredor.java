package Threads;

import java.util.concurrent.Semaphore;

public class Corredor implements Runnable {

    private String nome;
    private static final Semaphore semaforo = new Semaphore(2);

    public Corredor(String nome){
        this.nome = nome;
    }

    public void run(){
        int numVoltas = 5;

        for (int i = 1; i <= numVoltas; i++){

            // Simular o tempo de volta.
            System.out.println(i + " :" + nome);
        }
    }
}
