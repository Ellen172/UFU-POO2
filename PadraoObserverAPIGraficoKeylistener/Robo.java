
import java.util.Observer;
import java.util.Observable;
public class Robo implements Observer
{
    private int x; 
    private int y;
    
    public Robo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void update(Observable subject, Object arg) {
        Bola bola = (Bola) subject; // coersão de tipo: definir o sujeito [superclase] como bola [subclasse]
                
        // se estiver em distancia de chute 
        if ( ( (this.x - bola.getX())== 0 ) && (this.y - bola.getY())== 0 ){
            System.out.println("Jogador: " + this + " chuta bola..");
            if(Math.random() < 0.5){
                bola.setPos(bola.getX()+25, bola.getY()-15);
            } else {
                bola.setPos(bola.getX()-25, bola.getY()+15);
            }
        } 
        // se precisar andar na direção da bola 
        else {
            // se precisa andar pra frente 
            if(bola.getX() > this.x) this.x = this.x+1;
            else this.x = this.x-1;
            // andar para atrás
            if (bola.getY() > this.y) this.y = this.y+1;
            else this.y = this.y-1;
        }
    }
}
