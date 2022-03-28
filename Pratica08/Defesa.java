public abstract class Defesa
{
    private Defesa sucessor;
    
    public Defesa getSucessor() {
        return sucessor;
    }
    
    public void setSucessor(Defesa sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract void diminuiAtaque(int perda);
}