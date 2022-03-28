
public class Exterminador extends Inimigo
{
    public Exterminador(int x, int y, int velocidade){
        super(x, y);
        setAtaque(new RaioLaser());
        setCorrida(new CorridaVeloz(velocidade));
        setPulo(new PuloMedio());
    }
}
