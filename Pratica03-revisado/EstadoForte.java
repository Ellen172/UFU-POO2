
public class EstadoForte extends Estado
{
    public EstadoForte(Personagem personagem){
        super(personagem);
        this.getPersonagem().setPulo(new PuloAlto());
        this.getPersonagem().setCorrida(new CorridaRapida());
        this.getPersonagem().setAtaque(new AtaqueForte());
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() <= 70){
            // energia do personagem abaixo de 70%
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarEstado();
        }
    }
}
