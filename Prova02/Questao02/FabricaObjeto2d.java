
public class FabricaObjeto2d extends FabricaObjeto
{
    public Garrafa criaGarrafa(){
        return new Garrafa2d();
    }
    
    public Copo criaCopo(){
        return new Copo2d();
    }
    
    public Prato criaPrato(){
        return new Prato2d();
    }
}
