
public class Indisponivel extends Estado
{
    public Indisponivel(Produto prod){
        super(prod);
    }
    
    public void verificaEstado(){
        if(this.getProd().getQtd()>10){
            this.getProd().setState(new Disponivel(this.getProd()));
        }
        else if(this.getProd().getQtd()>0){
            this.getProd().setState(new Critico(this.getProd()));
        }
    }
}
