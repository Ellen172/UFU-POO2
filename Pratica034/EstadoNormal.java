
// o nível de energia estiver entre 30% e 70%
public class EstadoNormal extends LifeEstado
{
    public EstadoNormal(Personagem persona) {
        super(persona);
        this.getPersonagem().setCorrer(new CorrerMedio());
        this.getPersonagem().setAtacar(new AtacarMedio());
        this.getPersonagem().setEscudo(new Escudo02(persona));
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() < 30){
            this.getPersonagem().setLifeEstado(new EstadoPerigo(this.getPersonagem()));
            this.getPersonagem().getLifeEstado().verificarEstado();
        }
        else if(this.getPersonagem().getVida() > 70){
            this.getPersonagem().setLifeEstado(new EstadoForte(this.getPersonagem()));
        }
    }
    
    
}
