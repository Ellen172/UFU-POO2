
public abstract class Fase implements Game
{   
    int qtd, velocidade;
    String nome; 
    Fase caminho1, caminho2;
    
    public Fase(int qtd, int velocidade, String nome, 
        Fase caminho1, Fase caminho2){
            setQtd(qtd);
            setVelocidade(velocidade);
            setNome(nome);
            setCaminho1(caminho1);
            setCaminho2(caminho2);
        }
    
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    public int getQtd(){
        return qtd;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return velocidade; 
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCaminho1(Fase caminho1){
        this.caminho1 = caminho1;
    }
    public Fase getCaminho1(){
        return caminho1;
    }
    
    public void setCaminho2(Fase caminho2){
        this.caminho2 = caminho2;
    }
    public Fase getCaminho2(){
        return caminho2;
    }
    
    public abstract Inimigo createInimigo(int x, int y);
}
