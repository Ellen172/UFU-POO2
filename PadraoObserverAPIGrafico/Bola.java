
import java.util.Observable;
public class Bola extends Observable
{
    private int x = 0; 
    private int y = 0;
    
    public Bola(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
        setChanged(); // muda uma flag interna da classe para true, que permite a execução do notifyObservers()
        notifyObservers(); // herdado da superclasse Observable, executa e após altera a flag novamente para false
        }
    
    public void show() {
        setChanged(); // muda uma flag interna da classe para true, que permite a execução do notifyObservers()
        notifyObservers(); // herdado da superclasse Observable, executa e após altera a flag novamente para false
    }
}
