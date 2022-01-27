
public abstract class Escudo
{
    private Personagem p;
    private Escudo sucessor;
    
    public Escudo(Personagem p){
        setPersonagem(p);
    }
    
    public void setPersonagem(Personagem p){
        this.p = p;
    }
    public Personagem getPersonagem(){
        return p;
    }
    
    public Escudo getSucessor() {
	return sucessor;
    }
    public void setSucessor(Escudo sucessor) {
	this.sucessor = sucessor;
    }
    
    public abstract void perdeVida(int perda);
}
