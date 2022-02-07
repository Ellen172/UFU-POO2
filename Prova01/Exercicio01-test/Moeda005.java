// moeda de 0,05 (1,2cm)
public class Moeda005 extends Moeda{
    
    public Moeda005() {
        setSucessor(new Moeda010());
    }

    public void verificaMoeda(double tamanho) {
        if(tamanho == 1.2) {
            System.out.println("Moeda de R$ 0,05");
        } else {
            if(getSucessor() != null) {
                getSucessor().verificaMoeda(tamanho);
            } else {
                System.out.println("Moeda não reconhecida!v");
            }
        }
        
    }
}
