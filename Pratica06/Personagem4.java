/*
 * ataque forte 
 * poder fraco 
 * corrida devagar
 * pulo baixo
 */
public class Personagem4 extends Personagem
{
    public Personagem4(int x, int y)
    {
        super(x, y);
        setAtaque(new PoderFraco(new AtaqueForte()));
        setCorrida(new CorridaDevagar());
        setPulo(new PuloBaixo());
    }

}
