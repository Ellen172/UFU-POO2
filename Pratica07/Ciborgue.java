/* 
 * Personagem: ciborgue 
 * Ataque: bomba | alcance
 * Corrida: media
 * Pulo: alto
 */
public class Ciborgue extends Personagem
{
    public Ciborgue(int x, int y){
        super(x, y);
        setAtaque(new Alcance(new Bomba()));
        setCorrida(new CorridaMedia());
        setPulo(new PuloAlto());
        setDefesa(new CampoForca(this));
    }
}
