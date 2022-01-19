
public class Personagem
{
    private Pular p;
    private Correr c;
    private Atacar a;
    private LifeEstado e;
    private int vida;
    
    Personagem() {
        setVida(70);
        setLifeEstado(new EstadoNormal(this));
    }
    
    Personagem(Pular p, Correr c, Atacar a) {
        setPular(p);
        setCorrer(c);
        setAtacar(a);
    }
    
    public void setPular(Pular p){
        this.p = p;
    }
    public void setCorrer(Correr c){
        this.c = c;
    }
    public void setAtacar(Atacar a){
        this.a = a;
    }
    public void setLifeEstado(LifeEstado e){
        this.e = e;
    }
    public LifeEstado getLifeEstado(){
        return e;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
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
    
    public void ganhaVida(int bonus){
        e.ganhaVida(bonus);
        System.out.println("vida = " + this.getVida());
        System.out.println("estado = " + this.getLifeEstado().getClass().getName());
    }
    public void perdeVida(int perda){
        e.perdeVida(perda);
        System.out.println("vida = " + this.getVida());
        System.out.println("estado = " + this.getLifeEstado().getClass().getName());
    }
}
