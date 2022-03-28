//Component
public abstract class Carro {
    private double custo;
    private String descricao;
    
    public double getCusto() {
        return this.custo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setCusto(double custo){
        this.custo = custo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}