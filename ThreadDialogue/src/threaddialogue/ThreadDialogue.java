package threaddialogue;

/**
 *
 * @author Pizzi
 */
public class ThreadDialogue {

    public static void main(String[] args) {
        PizziCuoreRunnable R1 = new PizziCuoreRunnable('1');
        Thread T1 = new Thread(R1);
        T1.start();

        PizziCuoreRunnable R2 = new PizziCuoreRunnable('2');
        Thread T2 = new Thread(R2);
        T2.start();
    }

}
