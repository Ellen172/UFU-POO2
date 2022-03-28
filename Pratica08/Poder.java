public abstract class Poder extends Ataque
{    
    private Ataque ataque; 
    
    public Poder(Ataque ataque){
        this.ataque = ataque;
    }
    
    public int getValor(){
        return ataque.getValor() + super.getValor();
    }
    
    public String getNome(){
        return ataque.getNome() + " | " + super.getNome();
    }
}