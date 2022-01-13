
import java.util.ArrayList;    
public class Bola implements Sujeito {
    private int x = 0;
    private int y = 0;
    
    private ArrayList<Observador> lista = new ArrayList<Observador>();
    
    public Bola (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void addObserver(Observador o) {
        lista.add(o);
    }
    
    public void removeObserver (Observador o) {
        lista.remove(o);
    }
    
    public void notifyObservers() {
        for (Observador o : lista ) 
            o.update(this);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setPos (int x, int y) {
        this.x = x; 
        this.y = y;
        // notifyObservers();
    }
    
    public void show() {
        notifyObservers();
    }
    
}
