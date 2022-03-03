//Client
public class Teste{
    public static void main(String args[]){
        ExpressaoAritmetica e = new Operando(2);
        System.out.println("Operação 1: "+e.operacao());
        
        e = new Soma(new Operando(5),new Operando(5));
        System.out.println("Operação 2: "+e.operacao());
        
        e = new Soma // 5+5=10
        (
            new Soma // 2+3=5
            (
                new Operando(2), 
                new Soma // 2+1=3
                (
                    new Operando(2),
                    new Operando(1)
                )
            ),  
            new Operando(5)
        );             
        System.out.println("Operação 3: "+e.operacao());
        
        e = new Multiplicacao(new Operando(3), 
                            new Operando(10));
        System.out.println("Operação 4: "+e.operacao());
        
        e = new Multiplicacao( //(3+2)*(2*2)
            new Soma(new Operando(3), new Operando(2)), //3+2
            new Multiplicacao(new Operando(2), new Operando(2)) //2*2
        );
        System.out.println("Operação 5: "+e.operacao());
    }    
}