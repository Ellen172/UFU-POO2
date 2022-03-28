
public class GameMedieval extends Game
{
    private static Game game = null;
    
    public static synchronized Game getGame() {
        if (game == null) 
            game = new GameMedieval();   
        return game;    
    }
    
    public Personagem createPersonagem(int x, int y){
        double n = Math.random();
        
        if(n < 0.5){
            return new Arqueiro(x, y);
        }
        else {
            return new Guerreiro(x, y);
        }
    }
    
    
    public Inimigo createInimigo(int x, int y){
        return new Goblin(x, y);
    }
}
