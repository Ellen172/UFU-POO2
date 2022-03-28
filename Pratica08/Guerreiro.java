/* 
 * Personagem: guerreiro 
 * Ataque: espada | veneno
 * Corrida: rapida
 * Pulo: baixo
 */
public class Guerreiro extends Personagem
{
    public Guerreiro(int x, int y){
        super(x, y);
        setAtaque(new Veneno(new Espada()));
        setCorrida(new CorridaRapida());
        setPulo(new PuloBaixo());
        setDefesa(new EscudoFraco(this));
    }
}