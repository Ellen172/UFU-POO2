public class Personagem
{ 
    private Ataque ataque;
    private Pulo pulo;
    private Corrida corrida;
    private int vida;
    private Estado estado;
    
    public Personagem(){
        setVida(70);
        setEstado(new EstadoNormal(this)); // estado irá inicializar pulo, ataque e corrida
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
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public Estado getEstado(){
        return estado;
    }
    
    public void atacar(){
        ataque.atacar();
    }
    public void pular(){
        pulo.pular();
    }
    public void correr(){
        corrida.correr();
    }
    
    public void ganhaVida(int bonus){
        estado.ganhaVida(bonus);
        System.out.println("Nivel de vida = " + this.getVida());
        System.out.println("Estado atual = " + this.getEstado());
    }
    public void perdeVida(int perda){
        estado.perdeVida(perda);
        System.out.println("Nivel de vida = " + this.getVida());
        System.out.println("Estado atual = " + this.getEstado());
    }
}