package q6;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class ThreadUsadaQ6 extends Thread{
    private SomadorQ6 somador;
    public ThreadUsadaQ6(SomadorQ6 somador) {
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
