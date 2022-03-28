
public class FaseFuturista extends Fase
{    
    public FaseFuturista(int qtd, int velocidade, String nome, 
        Fase caminho1, Fase caminho2){
            super(qtd, velocidade, nome, caminho1, caminho2);
        }
        
    public Inimigo createInimigo(int x, int y){
        return new Exterminador(x, y, getVelocidade());
    }
}
