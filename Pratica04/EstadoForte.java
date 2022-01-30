// o nível de energia estiver acima de 70%
public class EstadoForte extends LifeEstado
{
    public EstadoForte(Personagem persona) {
        super(persona);
        this.getPersonagem().setCorrer(new CorrerRapido());
        this.getPersonagem().setAtacar(new AtacarForte());
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getVida() <= 70){
            this.getPersonagem().setLifeEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getLifeEstado().verificarEstado();
        }
    }
}
