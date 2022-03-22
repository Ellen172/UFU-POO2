
public class InimigoForte extends Inimigo
{
    public InimigoForte(int x, int y)
    {
        super(x, y);
        setEstado(new EstadoForte(this));
        setVida(100);
    }
}
