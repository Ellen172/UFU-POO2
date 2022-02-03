
public class Main
{
    public static void main (String [] args) {
        Produto prod = new Produto();
        
        prod.compra(2); // qtd=2 ; estado critico
        prod.venda(2); // qtd=0 ; estado indisponivel
        prod.compra(11); //qtd=11 ; estado disponivel
        prod.venda(30); // compra indisponivel
        prod.venda(11); // qtd=0 ; estado indisponivel
        prod.compra(5); // qtd=5 ; estado critico
        prod.compra(15); //qtd=20 ; estado disponivel
        prod.venda(14); //qtd=6 ; estado critico
        
        
    }
}
