// leaf
public class Operando implements ExpressaoAritmetica{
    private int conteudo;
    public Operando(int conteudo){
        this.conteudo = conteudo;
    }
    public int operacao(){
        return this.conteudo;
    }
}
