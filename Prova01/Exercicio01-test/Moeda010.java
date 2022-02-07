
// moeda de 0,10 (1.4cm)
public class Moeda010 extends Moeda {
    
    public Moeda010() {
        setSucessor(new Moeda050());
    }

    public void verificaMoeda(double tamanho) {
        if(tamanho == 1.4) {
            System.out.println("Moeda de R$ 0,10");
        } else {
            if(getSucessor() != null) {
                getSucessor().verificaMoeda(tamanho);
            } else {
                System.out.println("Moeda não reconhecida!");
            }
        }
        
    }
}
