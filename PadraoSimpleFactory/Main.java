

public class Main
{
    public static void main(String args[]){
        
        Personagem mago = SimplePersonagemFactory.createMago();
        Personagem feiticeiro = SimplePersonagemFactory.createFeiticeiro();
        Personagem campones = SimplePersonagemFactory.createCampones();
        
        // gera numeros de 1 a 100
        int random = 1 + (int) (Math.random() * 100);
        Personagem p = SimplePersonagemFactory.createPersonagem(random);
        
    }
}
