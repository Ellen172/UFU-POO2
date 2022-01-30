
import java.util.Observer;
import java.util.Observable;

public class Inimigo extends Personagem implements Observer
{
    private int x;
    private int y;
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public Inimigo(int x, int y){
        setVida(70);
        setLifeEstado(new EstadoNormal(this));
        setX(x);
        setY(y);
    }
    
    public void perdeVida(){
        System.out.println("Inimigo "+this+" atacado!" );
        super.getLifeEstado().perdeVida(15);
        System.out.println("vida = " + this.getVida());
        System.out.println("estado = " + this.getLifeEstado().getClass().getName());
    }
    
    public void update(Observable subject, Object arg){
        Personagem persona = (Personagem)subject;
        
        if((Math.abs(this.x-persona.getX())==0) 
            && (Math.abs(this.y-persona.getY())==0)) {
                // inimigo chegou ate o persongem
                System.out.println("Inimigo "+this+" ataca o personagem!");
                persona.perdeVida(10);
            }
        else {
            // andar em direção ao personagem
            if(persona.getX() > this.x)
                this.x = this.x+(int)(5*Math.random());
            else this.x = this.x-(int)(5*Math.random());
            if(persona.getY() > this.y)
                this.y = this.y+(int)(5*Math.random());
            else this.y = this.y-(int)(5*Math.random());
        }
        
        if (this.x < 0) this.x = 100;
        if (this.y < 0) this.y = 100;
    }
}
