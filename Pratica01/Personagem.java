
public abstract class Personagem
{
    private Pular p;
    private Correr c;
    private Atacar a;
    
    public void setPular(Pular p){
        this.p = p;
    }
    public void setCorrer(Correr c){
        this.c = c;
    }
    public void setAtacar(Atacar a){
        this.a = a;
    }
    
    public void pular(){
        p.pular();
    }
    public void correr(){
        c.correr();
    }
    public void atacar(){
        a.atacar();
    }
}
