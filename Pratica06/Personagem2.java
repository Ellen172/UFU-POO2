/*
 * ataque forte 
 * poder fraco 
 * corrida media
 * pulo alto
 */
public class Personagem2 extends Personagem
{
    
    public Personagem2(int x, int y)
    {
        super(x, y);
        setAtaque(new PoderFraco(new AtaqueForte()));
        setCorrida(new CorridaMedia());
        setPulo(new PuloAlto());
    }
}
