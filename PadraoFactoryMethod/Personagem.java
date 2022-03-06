
public class Personagem
{
    Ataque ataque; 
    Corrida corrida;
    
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }
    public Ataque getAtaque(){
        return ataque;
    }
    public void setCorrida(Corrida corrida){
        this.corrida = corrida;
    }
    public Corrida getCorrida(){
        return corrida;
    }
    
    public void atacar(Personagem p){
        System.out.println(this + " atacou o personagem " + p);
        ataque.atacar(p);
    }
    public void correr(){
        System.out.println(this + " correu");
        corrida.correr();
    }
}
