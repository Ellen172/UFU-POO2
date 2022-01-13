
public class Jogador extends Robo
{
    private String nome;
    public Jogador(int x, int y, String nome) {
        super(x, y);
        this.nome = nome;
    }
    
    public void chuta(Bola bola) {
        // se estiver em distancia de chute
        if( ( (this.getX() - bola.getX())<1) && ((this.getY() - bola.getY())<1) ) {
            System.out.println("Jogador: "+this+" chutou a bola..");
            if(Math.random() < 0.5) {
                bola.setPos(bola.getX()+(int)(100*Math.random()), bola.getY()-(int)(100*Math.random()));
            } else {
                bola.setPos(bola.getX()-(int)(100*Math.random()), bola.getY()+(int)(100*Math.random()));
            }
        }
    }
    
    public String toString() {
        return this.nome;
    }
}
