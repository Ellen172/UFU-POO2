
public abstract class Corrida
{
    private int valor;
    
    public Corrida(int valor){
        setValor(valor);
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    
    public abstract void correr();
}
