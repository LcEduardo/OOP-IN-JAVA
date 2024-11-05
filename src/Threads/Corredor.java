package Threads;

import java.util.concurrent.Semaphore;

public class Corredor implements Runnable {

    private String nome;
    private static final Semaphore semaforo = new Semaphore(2);

    public Corredor(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        try{
            System.out.println(nome + " está esperando para largar.");
            semaforo.acquire(); //Adquire uma permissão
            System.out.println(nome + " começou a correr!");

            Thread.sleep((long) (Math.random() * 3000) + 1000);
            int numVoltas = 5;

            for (int i = 1; i <= numVoltas; i++){

                // Simular o tempo de volta.
                System.out.println(i + " :" + nome);
            }
            System.out.println(nome + " terminou a corrida.");
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaforo.release(); // Libera a permissão para o próximo corredor
        }
    }
}
