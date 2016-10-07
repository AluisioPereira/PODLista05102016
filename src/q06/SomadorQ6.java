package q6;

/**
 * Created by Aluísio on 05/10/2016.
 */
public class SomadorQ6 {
    private boolean disponivel;
    private int x;
    private int y;

    public SomadorQ6() {
        this.disponivel = true;
        this.x = 0;
        this.y = 0;
    }


    public boolean diponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public synchronized int getX() {
        while (disponivel == false) {
            try {               
                wait();
            } catch (InterruptedException e) { }
        }
        this.disponivel = false;
        notifyAll();
        return x;
    }
    public synchronized void setX(int x) {
        while (disponivel == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        this.x = x;
        this.disponivel = true;
        notifyAll();
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public synchronized void sum() {

        while (this.disponivel == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        this.disponivel = false;

        setX(getY() + 1);
        setY(getX() + 1);

        this.disponivel = true;

        notify();
    }
}
