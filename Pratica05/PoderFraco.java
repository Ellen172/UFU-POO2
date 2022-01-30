
public class PoderFraco extends Poder
{
    public PoderFraco(Personagem persona){
        super(persona);
        persona.setAtaque(persona.getAtaque()+2);
    }
}
