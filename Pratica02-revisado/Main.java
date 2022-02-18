

public class Main
{
    public static void main(String args[]){
        System.out.println("\n----------------------------------");
        Personagem personagem = new Personagem();
        // inicia com 70 - estado normal 
        
        personagem.ganhaVida(10); // 80 - estado forte
        personagem.pular();
        personagem.atacar();
        personagem.correr();
        
        personagem.perdeVida(30); // 50 - estado normal
        personagem.pular();
        personagem.atacar();
        personagem.correr();
        
        personagem.perdeVida(40); // 10 - estado de perigo 
        personagem.pular();
        personagem.atacar();
        personagem.correr();
        
        personagem.ganhaVida(90); // 100 - estado forte
        personagem.pular();
        personagem.atacar();
        personagem.correr();
        
        personagem.perdeVida(120); // -20 - estado morto
        personagem.pular();
        personagem.atacar();
        personagem.correr();
        
        personagem.ganhaVida(30); // 10 - estado de perigo (não deve ser executado)
        personagem.pular();
        personagem.atacar();
        personagem.correr();
    
    }
}
