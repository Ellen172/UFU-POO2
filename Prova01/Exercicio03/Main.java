

public class Main
{
    public static void main(String [] args){
        Objeto obj = new Circulo();
        obj = new Sombra(obj);
        obj = new Cor(obj);
        
        System.out.println(obj.desenhar());
        
    }
}
