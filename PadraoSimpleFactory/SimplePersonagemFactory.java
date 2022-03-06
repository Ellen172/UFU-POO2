public class SimplePersonagemFactory{   
    // para criar aleatoriamente
    public static Personagem createPersonagem(int tipo){
        Personagem p = null;
        if (tipo > 60) {
            p = new Mago();
            System.out.println("Novo Mago");
        }
        else if (tipo > 30) {
            p = new Feiticeiro();
            System.out.println("Novo Feiticeiro");
        }
        else {
            p = new Campones();
            System.out.println("Novo Camponês");
        }
        return p;
    }
    // para criar especificos
    public static Personagem createMago(){
        System.out.println("Novo Mago");
        return new Mago();
    }
    public static Personagem createFeiticeiro(){
        System.out.println("Novo Feiticeiro");
        return new Feiticeiro();
    }
    public static Personagem createCampones(){
        System.out.println("Novo Camponês");
        return new Campones(); 
    }
}  