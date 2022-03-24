
public class InimigoFraco extends Inimigo
{
    public InimigoFraco(int x, int y)
    {
        super(x, y);
        setEstado(new EstadoPerigo(this));
        setVida(25);
    }
}
