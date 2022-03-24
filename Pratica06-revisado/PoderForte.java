
public class PoderForte extends Poder
{
    public PoderForte(Personagem personagem){
        super(personagem);
        personagem.getAtaque().setValor(personagem.getAtaque().getValor()+5);
    }
}

