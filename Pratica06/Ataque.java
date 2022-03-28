public abstract class Ataque
{  
    private int valor;
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    
    public void atacar(Inimigo inimigo){
        System.out.println("Personagem ataca o "+ inimigo +"!" );
        inimigo.perdeVida(this.getValor());
    }
}

