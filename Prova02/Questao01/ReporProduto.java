

public class ReporProduto implements Reposicao
{
    Fornecedor fornecedor;
    
    public ReporProduto(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
    
    public void execute(){
        fornecedor.enviarProduto();
    }
}
