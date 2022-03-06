
public class AdvancedGame extends Game
{
    public Personagem createPersonagem(int tipo){
        Personagem p = new Personagem();
        if (tipo == 1) {
            p.setAtaque(new PoderFogo(new AtaqueFraco()));
            p.setCorrida(new CorridaRapida());
        } 
        else if (tipo ==2) {
            p.setAtaque(new PoderVento(new AtaqueForte()));
            p.setCorrida(new CorridaLenta());}           
        return p;
    }
}
