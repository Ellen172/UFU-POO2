
public class Goblin extends Inimigo
{
    public Goblin(int x, int y, int velocidade)
    {
        super(x, y);
        setAtaque(new Porrete());
        setPulo(new PuloBaixo());
        setCorrida(new CorridaVeloz(velocidade));
    }
}
