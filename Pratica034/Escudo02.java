
public class Escudo02 extends Escudo
{
    private Personagem p;
    
    public Escudo02(Personagem p){
        super(p);
    }
    
    public void setPersonagem(Personagem p){
        this.p = p;
    }
    public Personagem getPersonagem(){
        return p;
    }
    
    public void perdeVida(int perda){
        if(perda != 0 && getSucessor() != null) 
        	getSucessor().perdeVida(perda-2);
        else {
           p.getLifeEstado().perdeVida(perda-2);
           System.out.println("Uso do Escudo01");
        }
    }
}