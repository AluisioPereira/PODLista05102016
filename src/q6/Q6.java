package q6;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class Q6 {

    public static void main(String[] args){


        SomadorQ6 somador = new SomadorQ6();

        for (int i = 0; i <= 10; i++ ) {


            Thread a = new ThreadUsadaQ6(somador);
            Thread b = new ThreadUsadaQ6(somador);


            a.start();
            b.start();

            System.out.println(somador.getX());

        }

        System.out.println("valor de x: " + somador.getX());

    }
}
