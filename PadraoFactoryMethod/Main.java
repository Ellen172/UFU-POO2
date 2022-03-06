

public class Main
{
    public static void main(String args[]){
        System.out.println("INICIANDO GAME TRADICIONAL ... ");
        
        Personagem p1 = new TradicionalGame().createPersonagem(2);
        Personagem p2 = new TradicionalGame().createPersonagem(1);
        
        p1.atacar(p2);
        p1.correr();
        p2.atacar(p1);
        p2.correr();
        
        System.out.println("INICIANDO GAME AVANÇADO ...");
        
        Personagem p3 = new AdvancedGame().createPersonagem(2);
        Personagem p4 = new AdvancedGame().createPersonagem(1);
        
        p3.atacar(p4);
        p3.correr();
        p4.atacar(p3);
        p4.correr();
    }
}
