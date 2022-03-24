
public class EstadoPerigo extends Estado
{
    public EstadoPerigo(Personagem personagem){
        super(personagem);
        this.getPersonagem().setPulo(new PuloBaixo());
        this.getPersonagem().setCorrida(new CorridaDevagar());
        this.getPersonagem().setAtaque(new AtaqueFraco());
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() <= 0){
            if(this.getPersonagem() instanceof Inimigo){
                // energia do inimigo abaixo de 0;
                System.out.println("Inimigo removido na lista");
            }
            else{
                // energia do personagem abaixo de 0
                System.out.println("Fim de Jogo!!!");
                System.exit(0); // encerra programa
            }
        }
        else if(this.getPersonagem().getVida() >= 30){
            // energia do personagem acima de 70%
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarEstado();
        }
    }
}
