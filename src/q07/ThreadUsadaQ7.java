package q7;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class ThreadUsadaQ7 extends Thread{
    private SomadorQ7 somador;
    public ThreadUsadaQ7(SomadorQ7 somador) {
        super();
        this.somador = somador;
    }
    @Override
    public void run() {
        synchronized (somador) {
            somador.sum();
        }
    }
}
