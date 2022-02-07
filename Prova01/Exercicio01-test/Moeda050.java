
// moeda de 0,50 (1.6cm)
public class Moeda050 extends Moeda {
    
    public Moeda050(){
        setSucessor(new Moeda100());
    }

    public void verificaMoeda(double tamanho) {
        if(tamanho == 1.6) {
            System.out.println("Moeda de R$ 0,50");
        } else {
            if(getSucessor() != null) {
                getSucessor().verificaMoeda(tamanho);
            } else {
                System.out.println("Moeda não reconhecida!");
            }
        }
        
    }
}

