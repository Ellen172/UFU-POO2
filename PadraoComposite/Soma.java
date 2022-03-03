//ConcreteComposite
public class Soma extends Operador{
    public Soma(ExpressaoAritmetica op1, ExpressaoAritmetica op2){
        super(op1, op2);
    }            
    public int operacao(){
        return getOp1().operacao() + getOp2().operacao();
    }
}
