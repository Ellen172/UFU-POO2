
public abstract class Decorador extends Objeto
{
    private Objeto obj;
    
    public Decorador(Objeto obj){
        this.obj = obj;
    }
    
    public String desenhar(){
        return obj.desenhar() + "," + super.getDescricao();
    }
}
