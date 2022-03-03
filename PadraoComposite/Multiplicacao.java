//ConcreteComposite
public class Multiplicacao extends Operador
{
    public Multiplicacao(ExpressaoAritmetica op1, ExpressaoAritmetica op2){
        super(op1, op2);
    }            
    public int operacao(){
        return getOp1().operacao() * getOp2().operacao();
    }
}
