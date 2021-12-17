
//  nível de energia do personagem está maior do que 0 e abaixo de 30%
public class EstadoPerigo extends LifeEstado
{
    EstadoPerigo(){
        super(new Personagem(new CorrerDevagar(), new AtacarFraco()));
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() < 0){
            this.getPersonagem().setLifeEstado(new EstadoMorto());
        }
        else if(this.getPersonagem().getVida() >= 30){
            this.getPersonagem().setLifeEstado(new EstadoNormal());
        }
    }
}
