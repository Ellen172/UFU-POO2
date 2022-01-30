
public class PoderForte extends Poder
{
    public PoderForte(Personagem persona){
        super(persona);
        persona.setAtaque(persona.getAtaque()+5);
    }
}
