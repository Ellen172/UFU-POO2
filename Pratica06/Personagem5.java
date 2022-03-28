/*
 * ataque forte 
 * poder medio 
 * corrida rapida
 * pulo baixo
 */
public class Personagem5 extends Personagem
{
    public Personagem5(int x, int y)
    {
        super(x, y);
        setAtaque(new PoderMedio(new AtaqueForte()));
        setCorrida(new CorridaRapida());
        setPulo(new PuloBaixo());
    }
}
