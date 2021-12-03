
public class Main
{
    public static void main(){
        Personagem p;
        
        System.out.println("Personagem A");
        p = new PersonagemA();
        p.atacar();
        p.movimentar();
        
        System.out.println("Personagem B");
        p = new PersonagemB();
        p.atacar();
        p.movimentar();
        
        System.out.println("Personagem C");
        p = new PersonagemC();
        p.atacar();
        p.movimentar();
        
        System.out.println("Personagem D");
        p = new PersonagemD();
        p.atacar();
        p.movimentar();
        System.out.println("Novo Personagem D");
        p.setAtaque(new AtaqueForte());
        p.atacar();
        p.movimentar();
        
        System.out.println("Personagem F");
        p = new PersonagemF();
        p.atacar();
        p.movimentar();
    }
}
