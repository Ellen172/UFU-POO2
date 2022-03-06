
public abstract class Game
{
    public abstract Personagem createPersonagem(int tipo);
    
    public void Jogar(){
        //logica de execução (controller)
        Personagem p1 = createPersonagem(1);
        Personagem p2 = createPersonagem(2);
        p1.atacar(p2);
        p1.correr();
        p2.atacar(p1);
        p2.correr();
    }
}
