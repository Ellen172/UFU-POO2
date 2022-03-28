// departamento de compras (invoker)
// tem que aprovar o pedido de reposição
public class Compras
{
    Reposicao reposicao; // pedido de reposicao
    
    public Compras(Reposicao reposicao){
        setReposicao(reposicao);
    }
    
    public void setReposicao(Reposicao reposicao){
        this.reposicao = reposicao;
    }
    
    public void pedirReposicao(){
        reposicao.execute();
    }
}
