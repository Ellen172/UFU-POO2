/*
 * ataque medio 
 * poder forte 
 * corrida devagar
 * pulo alto
 */
public class Personagem3 extends Personagem
{
    public Personagem3(int x, int y)
    {
        super(x, y);
        setAtaque(new PoderForte(new AtaqueMedio()));
        setCorrida(new CorridaDevagar());
        setPulo(new PuloAlto());
    }

}
