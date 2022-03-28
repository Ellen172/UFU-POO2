// fornecedor do produto que se deseja repor (receiver)
public class Fornecedor2 implements Fornecedor {
    Produto produto;
    
    public Fornecedor2(Produto produto){
        setProduto(produto);
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public Produto getProduto(){
        return this.produto;
    }
    
    public void enviarProduto(){
        produto.setQtd(produto.getQtd() + 20);
    }
}
