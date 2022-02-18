
public class Personagem3 extends Personagem
{
    public Personagem3(){
        setNome("Personagem 3");
        setPulo(new PuloBaixo());
        setCorrida(new CorridaRapida());
        setAtaque(new AtaqueForte());
    }
}
