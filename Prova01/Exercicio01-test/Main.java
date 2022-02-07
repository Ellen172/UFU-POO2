

public class Main {
    public static void main(String [] args) {
        Moeda moeda001 = new Moeda001();
        
        moeda001.verificaMoeda(1.0); // moeda de 0,01
        moeda001.verificaMoeda(1.2); // moeda de 0,05
        moeda001.verificaMoeda(1.4); // moeda de 0,10
        moeda001.verificaMoeda(1.6); // moeda de 0,50
        moeda001.verificaMoeda(1.8); // moeda de 1,00
        moeda001.verificaMoeda(1.9); // inexistente
    }
}
