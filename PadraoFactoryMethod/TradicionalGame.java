
public class TradicionalGame extends Game
{
    Personagem p = new Personagem();
    
    public Personagem createPersonagem(int tipo){
        if (tipo == 1) {
            p.setAtaque(new AtaqueFraco());
            p.setCorrida(new CorridaRapida());
        } 
        else {
            p.setAtaque(new AtaqueForte());
            p.setCorrida(new CorridaLenta());
        }   
        return p;
    }
}
