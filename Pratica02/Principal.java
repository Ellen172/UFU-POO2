
public class Principal
{
    public static void main(String args[]){        
        Personagem persona = new Personagem();
        // inicia com 70 - estado normal 
        
        persona.ganhaVida(10); // 80 - estado forte
        persona.perdeVida(30); // 50 - estado normal
        persona.perdeVida(40); // 10 - estado de perigo 
        persona.ganhaVida(90); // 100 - estado forte
        persona.perdeVida(120); // -20 - estado morto
        persona.ganhaVida(30); // 10 - estado de perigo (não deve ser executado)
    }
}
