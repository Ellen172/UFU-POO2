
public abstract class Personagem
{
    String ataque;
    
    public Personagem(String ataque){
        setAtaque(ataque);
    }
    
    public void setAtaque(String ataque){
        this.ataque = ataque;
    }
    public String getAtaque(){
        return ataque;
    }
}
