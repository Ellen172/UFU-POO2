
public class GameFuturista implements Game
{
    private static Game game = null;
    
    public static synchronized Game getGame() {
        if (game == null) 
            game = new GameFuturista();   
        return game;    
    }
    
    public void jogar(){
        System.out.println("Game criado!");
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
}
