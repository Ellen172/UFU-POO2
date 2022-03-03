public class SimplePersonagemFactory{   
    // para criar aleatoriamente
    public static Personagem createPersonagem(int tipo){
        Personagem p = null;
        if (tipo == 1) 
            p = new Mago();
        else if (tipo > 0.5) 
            p = new Feiticeiro();
        else
            p = new Campones(); 
        return p;
    }
    // para criar especificos
    public static Personagem createMago(){
        return new Mago();
    }
    public static Personagem createFeiticeiro(){
        return new Feiticeiro();
    }
    public static Personagem createCampones(){
        return new Campones(); 
    }
}  