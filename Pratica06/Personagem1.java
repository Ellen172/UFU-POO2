/* 
 * ataque fraco 
 * poder fraco 
 * corrida rapida
 * pulo medio
 */
public class Personagem1 extends Personagem
{

    public Personagem1(int x, int y)
    {
        super(x, y);
        setAtaque(new PoderFraco(new AtaqueFraco()));
        setCorrida(new CorridaRapida());
        setPulo(new PuloMedio());
    }

}
