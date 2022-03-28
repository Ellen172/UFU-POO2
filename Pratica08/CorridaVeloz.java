
public class CorridaVeloz extends Corrida
{
    public CorridaVeloz(int velocidade){
        super(velocidade);
    }
    
    public void correr(){
        System.out.println("Corrida com velocidade igual a " + getValor());
    }
}
