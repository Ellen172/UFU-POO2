/* 
 * Personagem: robo 
 * Ataque: raio laser | precisao
 * Corrida: lenta
 * Pulo: medio
 */
public class Robo extends Personagem
{
    public Robo(int x, int y){
        super(x, y);
        setAtaque(new Precisao(new RaioLaser()));
        setCorrida(new CorridaDevagar());
        setPulo(new PuloMedio());
        setDefesa(new CampoForca(this));
    }
}
