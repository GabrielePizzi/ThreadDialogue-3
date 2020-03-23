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
    private int counter;

    PizziCuoreRunnable(char nome, int contatore) {
        this.nome = nome;
        counter = contatore;

    }

    void stampaThread(int contatore) throws InterruptedException {
        switch (contatore) {
            case 1:
                System.out.println("Ciao Thread 2");
                break;
            case 2:
                System.out.println("Ciao Thread 1");
                break;
            case 3:
                System.out.println("Come va la vita?");
                break;
            case 4:
                System.out.println("Potrebbe andare meglio");
                break;
            case 5:
                System.out.println("Andiamo a berci una birra?");
                break;
            case 6:
                System.out.println("No non possiamo");
                break;
            case 7:
                System.out.println("Perchè?");
                break;
            case 8:
                System.out.println("C'è la pandemia");
                break;
            case 9:
                System.out.println("Esagerato è solo un'influenza");
                break;
            case 10:
                System.out.println("No,  ti sbagli, ora è in tutta Italia");
                break;
            case 11:
                System.out.println("Davvero? Non lo sapevo");
                break;
            case 12:
                System.out.println("Cringe");
                break;
            case 13:
                System.out.println("AHAHAHAH");
                break;
            case 14:
                System.out.println("Cosa ridi?");
                break;
            case 15:
                System.out.println("Non sto ridendo");
                break;
            case 16:
                System.out.println("Diocane");
                break;
            case 17:
                System.out.println("BASTAAA");
                break;
            case 18:
                System.out.println("POGLIANI STAI ZITTO");
                break;
            case 19:
                System.out.println("Neffy Su PH Premium");
                break;
            case 20:
                System.out.println("EREzione PElato");
                break;
            default:
                break;

        }
    }
    
    public char getNome(){
     return nome;   
    }    
    
    public int getCounter(){
     return counter;   
    }    
    
//    public boolean isPari(){
//        
//    }
//    
//    public int isDispari(){
//        
//    }
    
    @Override
    public void run() {
        try {
            for (int i = 1; i < 21; i++) {
                Thread.sleep(1000);
                if (getNome()=='a') {
                if (getCounter()%2==0) {             
                    stampaThread(getCounter());
                } else{
                    System.out.print("");
                } 
            
            } else if (getNome()=='b'){
                if (getCounter()%2!=0) {
                    stampaThread(getCounter());
                } else{
                    System.out.print("");
                }
            }
            counter++;
        }
            
        }catch (InterruptedException ex) {
                    Logger.getLogger(PizziCuoreRunnable.class.getName()).log(Level.SEVERE, null, ex);
                }

        //throw new UnsupportedOperationException("Not supported yet.");
    }
}

