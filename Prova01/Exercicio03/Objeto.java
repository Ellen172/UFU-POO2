
public abstract class Objeto
{
    private String descricao;
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public String desenhar(){
        return descricao;
    }
}
