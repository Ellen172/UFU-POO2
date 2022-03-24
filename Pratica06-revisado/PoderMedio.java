
public class PoderMedio extends Poder
{
    public PoderMedio(Personagem personagem){
        super(personagem);
        personagem.getAtaque().setValor(personagem.getAtaque().getValor()+3);
    }
}
