
public class Main
{
    public static void main(String args[]){
        System.out.println("Iniciando..");
        
        // Criar objetos 2d
        FabricaObjeto fabrica2d = new FabricaObjeto2d();
        Prato prato2d = fabrica2d.criaPrato();
        prato2d.desenhar();
        Copo copo2d = fabrica2d.criaCopo();
        copo2d.desenhar();
        Garrafa garrafa2d = fabrica2d.criaGarrafa();
        garrafa2d.desenhar();
        
         // Criar objetos 2d
        FabricaObjeto fabrica3d = new FabricaObjeto3d();
        Prato prato3d = fabrica3d.criaPrato();
        prato3d.desenhar();
        Copo copo3d = fabrica3d.criaCopo();
        copo3d.desenhar();
        Garrafa garrafa3d = fabrica3d.criaGarrafa();
        garrafa3d.desenhar();
    }
}
