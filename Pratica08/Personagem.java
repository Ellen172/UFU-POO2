import java.util.Observable;

public abstract class Personagem extends Observable
{ 
    private Estado estado;
    private Ataque ataque;
    private Pulo pulo;
    private Corrida corrida;
    private Defesa defesa;
    private Poder poder;
    private int vida;
    // posições do personagem
    private int x; 
    private int y;
    
    public Personagem(int x, int y){
        setVida(70);
        setEstado(new EstadoNormal(this));
        setX(x);
        setY(y);
    }
    
    public Personagem(){
        setVida(70);
        setEstado(new EstadoNormal(this));
        setX(x);
        setY(y);
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public Estado getEstado(){
        return estado;
    }
    
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }
    public Ataque getAtaque(){
        return ataque;
    }
    
    public void setPulo(Pulo pulo){
        this.pulo = pulo;
    }
    public Pulo getPulo(){
        return pulo;
    }
    
    public void setCorrida(Corrida corrida){
        this.corrida = corrida;
    }
    public Corrida getCorrida(){
        return corrida;
    }
    
    public void setDefesa(Defesa defesa){
        this.defesa = defesa;
    }
    public Defesa getDefesa(){
        return defesa;
    }
    
    public void setPoder(Poder poder){
        this.poder = poder;
    }
    public Poder getPoder(){
        return poder;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    
    public void atacar(Inimigo inimigo){
        ataque.atacar(inimigo);
    }
    public void pular(){
        pulo.pular();
    }
    public void correr(){
        corrida.correr();
    }
    
    public void ganhaVida(int bonus){
        System.out.println("--"+this+" Ganha Vida--");
        System.out.println("Vida antiga: " + this.getVida());
        estado.ganhaVida(bonus);
        System.out.println("Vida atual: " + this.getVida());
        System.out.println();
    }
    public void perdeVida(int perda){
        System.out.println("--"+this+" Perde Vida--");
        System.out.println("Vida antiga: " + this.getVida());
        if(getDefesa() != null){
            System.out.println("Defesa:" + getDefesa());
            getDefesa().diminuiAtaque(perda);
        } else {
            estado.perdeVida(perda);
        }
        System.out.println("Vida atual: " + this.getVida());
        System.out.println();
    }
    
    public void show() {
        setChanged();
        notifyObservers();
    }
}