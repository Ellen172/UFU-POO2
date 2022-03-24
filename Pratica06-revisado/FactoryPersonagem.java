
public class FactoryPersonagem
{
    public Personagem createPersonagem(int x, int y){
        Personagem personagem = null;
        double tipo = Math.random();
        
        if(tipo == 0.2){
              personagem = new Personagem1(x, y);
        } 
        else if(tipo == 0.4){
              personagem = new Personagem2(x, y);
        } 
        else if(tipo == 0.6){
              personagem = new Personagem3(x, y);
        } 
        else if(tipo == 0.8){
              personagem = new Personagem4(x, y);
        } 
        else if(tipo == 1){
              personagem = new Personagem5(x, y);
        } 
        
        return personagem;
    }
}
