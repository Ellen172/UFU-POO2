
public abstract class LifeEstado
{
    private Personagem p;
    
    LifeEstado(Personagem p){
        setPersonagem(p);
    }
    
    public void setPersonagem(Personagem p){
        this.p = p;
    }
    public Personagem getPersonagem(){
        return p;
    }
    
    public void ganhaVida(int bonus){
        this.p.setVida(this.p.getVida()+bonus);
        this.verificarEstado();
    }
    public void perdeVida(int perda){
        this.p.setVida(this.p.getVida()-perda);
        this.verificarEstado();
    }
    
    protected abstract void verificarEstado();
}
