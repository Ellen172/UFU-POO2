public class Principal{
    public static void main(){
        Carro voyage = new Voyage();
        Carro fusca = new Fusca();
        voyage = new ArCondicionado(voyage);
        voyage = new VidroEletrico(voyage);
        fusca = new RodaLigaLeve(fusca);
        // fusca
        System.out.println("Fusca");
        System.out.println(fusca.getDescricao());
        System.out.println(fusca.getCusto());   
        // voyage
        System.out.println("Voyage");
        System.out.println(voyage.getDescricao());
        System.out.println(voyage.getCusto()); 
    }
}