/* Para testar , foi criada a classe produto. 
 * Ao receber do fornecedor1 , a quantidade de produtos aumenta em 10
 * Ao receber do fornecedor2 , a quantidade de produtos aumenta em 20
 * Ao receber do fornecedor3 , a quantidade de produtos aumenta em 30
 */

public class Main
{
    public static void main(String args[]){
        // criação de produtos
        Produto produto = new Produto();
        produto.setQtd(10);
        System.out.println("Qtd do produto: " + produto.getQtd());
        
        // pedindo reposição para o fornecedor 1        
        Compras compras1 = new Compras(new ReporProduto(new Fornecedor1(produto)));
        // reposicao aprovada - pedido feito
        compras1.pedirReposicao();
        // nova qtd de produtos no estoque
        System.out.println("Qtd do produto: " + produto.getQtd());
        
        // pedindo reposição para o fornecedor 2        
        Compras compras2 = new Compras(new ReporProduto(new Fornecedor2(produto)));
        // reposicao aprovada - pedido feito
        compras2.pedirReposicao();
        // nova qtd de produtos no estoque
        System.out.println("Qtd do produto: " + produto.getQtd());
        
        // pedindo reposição para o fornecedor 1        
        Compras compras3 = new Compras(new ReporProduto(new Fornecedor3(produto)));
        // reposicao aprovada - pedido feito
        compras3.pedirReposicao();
        // nova qtd de produtos no estoque
        System.out.println("Qtd do produto: " + produto.getQtd());
        
    }
}
