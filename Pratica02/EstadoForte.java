// o nível de energia estiver acima de 70%
public class EstadoForte extends LifeEstado
{
    public EstadoForte() {
        super(new Personagem(new CorrerRapido(), new AtacarForte()));
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() <= 70){
            this.getPersonagem().setLifeEstado(new EstadoNormal());
        }
    }
}
