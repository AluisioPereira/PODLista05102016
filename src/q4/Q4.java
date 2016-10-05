package q4;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class Q4 {
    //declaração
    private static int x = 0;
    private static int y = 0;


    //procedimento
    public static void sum() {
        x = y + 1;
        y = x + 1;
    }



    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++ ) {

            //Thread A
            Thread a = new Thread() {

                public void run() {
                    sum();
                }
            };
            a.start();
            //Thread B
            Thread b = new Thread() {
                public void run() {
                    sum();
                }
            };
            b.start();
            System.out.println("valor de x: " +x);

        }

    }

}
