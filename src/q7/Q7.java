package q7;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class Q7 {
    private static int x = 0;
    private static int y = 0;
    public static void main(String[] args) throws InterruptedException {
        SomadorQ7 somador = new SomadorQ7();
        for (int i = 1; i <= 10; i++ ) {
            Thread a = new ThreadUsadaQ7(somador);
            Thread b = new ThreadUsadaQ7(somador);
            synchronized (somador) {
                a.start();
                b.start();
                System.out.println(somador.getX());
            }
        }
        Thread.sleep(1000);
        System.out.println("valor de x: " + somador.getX());
    }
}
