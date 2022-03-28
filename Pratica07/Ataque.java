public abstract class Ataque
{  
    private int valor;
    private String nome;
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void atacar(Inimigo inimigo){
        System.out.println("Personagem ataca o "+ inimigo +" com " + getNome());
        inimigo.perdeVida(this.getValor());
    }
}

