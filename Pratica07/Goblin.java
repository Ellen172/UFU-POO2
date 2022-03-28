
public class Goblin extends Inimigo
{
    public Goblin(int x, int y)
    {
        super(x, y);
        setAtaque(new Porrete());
        setCorrida(new CorridaRapida());
        setPulo(new PuloBaixo());
    }
}
