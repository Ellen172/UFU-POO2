
public class PoderFraco extends Poder
{
    public PoderFraco(Personagem personagem){
        super(personagem);
        personagem.getAtaque().setValor(personagem.getAtaque().getValor()+2);
    }
}