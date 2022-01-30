import java.util.Observable;

public class Personagem extends Observable
{
    private Pular p;
    private Correr c;
    private Atacar a;
    private LifeEstado e;
    private Escudo esc;
    private int vida;
    private int x, y;
    
    Personagem() {
        setVida(70);
        setLifeEstado(new EstadoNormal(this));
        setX(50);
        setY(50);
    }
    
    Personagem(Pular p, Correr c, Atacar a, int x, int y) {
        setPular(p);
        setCorrer(c);
        setAtacar(a);
        setX(x);
        setY(y);
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
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setEscudo(Escudo esc){
        this.esc = esc;
    }
    public Escudo getEscudo(){
        return esc;
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
        System.out.println("Escudo = "+getEscudo());
        if(getEscudo() != null){
            getEscudo().diminuiAtaque(perda);
        } else {
            e.perdeVida(perda);
        }
        System.out.println("vida = " + this.getVida());
        System.out.println("estado = " + this.getLifeEstado().getClass().getName());
    }
    
    public void show() {
        setChanged();
        notifyObservers();
    }
}
