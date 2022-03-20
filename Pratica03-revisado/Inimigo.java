import java.util.Observer;
import java.util.Observable;

public abstract class Inimigo extends Personagem implements Observer
{
    public Inimigo(int x, int y){
        super(x, y);
    }
    
    public void update(Observable subject, Object arg){  
        Personagem personagem = (Personagem)subject;
        
        if((Math.abs(this.getX()-personagem.getX())==0) 
            && (Math.abs(this.getY()-personagem.getY())==0)) {
                // inimigo chegou ate o persongem
                System.out.println("Inimigo "+ this +" ataca o personagem!");
                personagem.perdeVida(this.getAtaque().getValor());
            }
        else {
            // andar em direção ao personagem
            if(personagem.getX() > this.getX())
                this.setX(this.getX()+(int)(5*Math.random()));
            else 
                this.setX(this.getX()-(int)(5*Math.random()));
            if(personagem.getY() > this.getY())
                this.setY(this.getY()+(int)(5*Math.random()));
            else 
                this.setY(this.getY()-(int)(5*Math.random()));
        }
        
        if (this.getX() < 0)
            this.setX(100);
        if (this.getY() < 0) 
            this.setY(100);
    }
}
