
//  nível de energia do personagem está maior do que 0 e abaixo de 30%
public class EstadoPerigo extends LifeEstado
{
    public EstadoPerigo(Personagem persona){
        super(persona);
        this.getPersonagem().setCorrer(new CorrerDevagar());
        this.getPersonagem().setAtacar(new AtacarFraco());
        this.getPersonagem().setEscudo(new Escudo01(persona));
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() <= 0){
            System.out.println("Estado Morto!");
            if(this.getPersonagem() instanceof Inimigo){
                this.getPersonagem();
            } else {
                System.exit(0);
            }
        }
        else if(this.getPersonagem().getVida() >= 30){
            this.getPersonagem().setLifeEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getLifeEstado().verificarEstado();
        }
    }
}
