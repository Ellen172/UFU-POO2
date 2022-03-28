/* 
 * Personagem: arqueiro 
 * Ataque: arco e flecha | flecha com fogo 
 * Corrida: media
 * Pulo: alto
 */
public class Arqueiro extends Personagem
{
    public Arqueiro(int x, int y){
        super(x, y);
        setAtaque(new FlechaFogo(new ArcoFlecha()));
        setCorrida(new CorridaMedia());
        setPulo(new PuloAlto());
        setDefesa(new EscudoFraco(this));
    }
}
