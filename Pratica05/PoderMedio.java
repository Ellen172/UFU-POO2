
public class PoderMedio extends Poder
{
    public PoderMedio(Personagem persona){
        super(persona);
        persona.setAtaque(persona.getAtaque()+3);
    }
}
