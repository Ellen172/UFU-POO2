
// o nível de energia estiver entre 30% e 70%
public class EstadoNormal extends LifeEstado
{
    public EstadoNormal() {
        super(new Personagem(new CorrerMedio(), new AtacarMedio()));
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() < 30){
            this.getPersonagem().setLifeEstado(new EstadoPerigo());
        }
        else if(this.getPersonagem().getVida() > 70){
            this.getPersonagem().setLifeEstado(new EstadoForte());
        }
    }
}
