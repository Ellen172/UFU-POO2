
public abstract class Poder extends Ataque
{
    private Ataque poderAtaque;
    
    public Poder(Ataque poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
    
    public String getAtaqueNome(){
        return poderAtaque.getAtaqueNome() + " e " + super.getAtaqueNome();
    }
}
