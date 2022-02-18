public abstract class Personagem
{ 
    private String nome;
    private Ataque ataque;
    private Pulo pulo;
    private Corrida corrida;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
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
    
    public void atacar(){
        ataque.atacar(this.nome);
    }
    public void pular(){
        pulo.pular(this.nome);
    }
    public void correr(){
        corrida.correr(this.nome);
    }
}