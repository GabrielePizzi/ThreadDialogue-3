package threaddialogue;

/**
 *
 * @author Pizzi
 */
public class ThreadDialogue {

    public static void main(String[] args) {

        int contatore = 1;

        PizziCuoreRunnable R1 = new PizziCuoreRunnable('a', contatore);
        Thread T1 = new Thread(R1);
        T1.start();

        PizziCuoreRunnable R2 = new PizziCuoreRunnable('b', contatore);
        Thread T2 = new Thread(R2);
        T2.start();
    }

}
