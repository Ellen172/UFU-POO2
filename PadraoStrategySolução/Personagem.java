
public abstract class Personagem
{
    private Ataque a; // composição com a classe Ataque
    private Movimento m; // composição com a classe Movimento
    
    public void setAtaque(Ataque a){
        this.a = a;
    }
    
    public void setMovimento(Movimento m){
        this.m = m;
    }
    
    public void atacar(){
        // delegação de responsabilidade
        a.atacar();
    }
    
    public void movimentar(){
        // delegação de responsabilidade
        m.movimentar();
    }
}
