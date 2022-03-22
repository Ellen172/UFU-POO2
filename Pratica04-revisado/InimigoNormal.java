
public class InimigoNormal extends Inimigo
{
    public InimigoNormal(int x, int y)
    {
        super(x, y);
        setEstado(new EstadoNormal(this));
        setVida(70);
    }
    
}
