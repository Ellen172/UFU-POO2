
public class GameFuturista extends Game
{
    private static Game game = null;
    
    public static synchronized Game getGame() {
        if (game == null) 
            game = new GameFuturista();   
        return game;    
    }
    
    public Personagem createPersonagem(int x, int y){
        double n = Math.random();
        
        if(n < 0.5){
            return new Robo(x, y);
        }
        else {
            return new Ciborgue(x, y);
        }
    }
    
    public Inimigo createInimigo(int x, int y){
        return new Exterminador(x, y);
    }
}
