package pack;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Cinema {

    private static final int MAX_PERSONE = 50; //capacità del cinema
    private static volatile int numPersonePresenti = 0; //numero di persone presenti nel cinema
    private static Semaphore semaforoCasse = new Semaphore(2); //semaforo per gestire l'accesso alle casse
    private static Semaphore semaforoSala = new Semaphore(MAX_PERSONE); //semaforo per gestire l'accesso alla sala
    private static int[] classifica = new int[MAX_PERSONE]; //array per tenere traccia dei voti
    
    public void acquisto() throws InterruptedException {
    	semaforoCasse.acquire();
    	if(numPersonePresenti < 50) {
	    	numPersonePresenti++;
	    	System.out.println("Biglietto acquistato in cassa, mancano " + (50 - numPersonePresenti) + " posti");
	    } else {
	    	System.out.println("L'ultimo biglietto è già stato venduto!");
	    }
	    semaforoCasse.release();
    }
    public static void main(String[] args) {

        
        

        

    }

 
}
