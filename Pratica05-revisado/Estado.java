
public abstract class Estado
{
    Personagem personagem; 
    
    public Estado(Personagem personagem){
        setPersonagem(personagem);
    }
    
    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    public Personagem getPersonagem(){
        return personagem;
    }
    
    public abstract void verificarEstado();
    
    public void ganhaVida(int bonus){
        this.personagem.setVida(this.personagem.getVida()+bonus);
        this.verificarEstado();
    }
    public void perdeVida(int perda){
        this.personagem.setVida(this.personagem.getVida()-perda);
        this.verificarEstado();
    }
}
