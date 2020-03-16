package threaddialogue;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pizzi
 */
public class PizziCuoreRunnable implements Runnable {

    private static void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private Thread T = null;

    private final char nome;

    PizziCuoreRunnable(char nome) {
        this.nome = nome;

    }

    public void stampaThread1() throws InterruptedException {
        System.out.println("Ciao Thread 2");
        Thread.sleep(2000);
        System.out.println("Come va la vita?");
        Thread.sleep(2000);
        System.out.println("Andiamo a berci una birra?");
        Thread.sleep(2000);
        System.out.println("Perchè?");
        Thread.sleep(2000);
        System.out.println("Esagerato è solo un'influenza");
        Thread.sleep(2000);
        System.out.println("Davvero? Non lo sapevo");
        Thread.sleep(2000);
        System.out.println("Cringe");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");

    }

    public void stampaThread2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Ciao Thread 1");
        Thread.sleep(2000);
        System.out.println("Potrebbe andare meglio");
        Thread.sleep(2000);
        System.out.println("No non possiamo");
        Thread.sleep(2000);
        System.out.println("C'è la pandemia");
        Thread.sleep(2000);
        System.out.println("No,  ti sbagli, ora è in tutta Italia");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");

    }

    @Override
    public void run() {
        if (nome == '1') {
            try {
                stampaThread1();
            } catch (InterruptedException ex) {
                Logger.getLogger(PizziCuoreRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (nome == '2') {
            try {
                stampaThread2();
            } catch (InterruptedException ex) {
                Logger.getLogger(PizziCuoreRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
