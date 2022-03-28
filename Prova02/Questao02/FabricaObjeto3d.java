
public class FabricaObjeto3d extends FabricaObjeto
{
    public Garrafa criaGarrafa(){
        return new Garrafa3d();
    }
    
    public Copo criaCopo(){
        return new Copo3d();
    }
    
    public Prato criaPrato(){
        return new Prato3d();
    }
}
