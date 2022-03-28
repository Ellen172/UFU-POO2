
public class EstadoNormal extends Estado
{
    public EstadoNormal(Personagem personagem){
        super(personagem);
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() < 30){
            // energia do personagem abaixo de 30%
            this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarEstado();
        }
        else if(this.getPersonagem().getVida() > 70){
            // energia do personagem acima de 70%
            this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
        }

    }
}
