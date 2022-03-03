//Composite
public abstract class Operador 
    implements ExpressaoAritmetica
{
    private ExpressaoAritmetica op1;
    private ExpressaoAritmetica op2;   
    
    public Operador(ExpressaoAritmetica op1, 
        ExpressaoAritmetica op2)
    {
        this.op1 = op1;
        this.op2 = op2;           
    }
    
    public ExpressaoAritmetica getOp1(){
        return this.op1;
    }    
    
    public ExpressaoAritmetica getOp2(){
        return this.op2;
    }       
}
