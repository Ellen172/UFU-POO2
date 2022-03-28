
public class Exterminador extends Inimigo
{
    public Exterminador(int x, int y){
        super(x, y);
        setAtaque(new RaioLaser());
        setCorrida(new CorridaDevagar());
        setPulo(new PuloMedio());
    }
}
