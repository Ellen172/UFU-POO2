

public class Main
{
    public static void main(String args[]){
        System.out.println("\n----------------------------------");
        Personagem persona1 = new Personagem1();
        Personagem persona2 = new Personagem2();
        Personagem persona3 = new Personagem3();
        
        persona1.pular();
        persona1.correr();
        persona1.atacar();
        
        persona2.pular();
        persona2.correr();
        persona2.atacar();
        
        persona3.pular();
        persona3.correr();
        persona3.atacar();
    }
}
