
// moeda de 0,01 (1cm)
public class Moeda001 extends Moeda {
    
    public Moeda001() {
        setSucessor(new Moeda005());
    }
    
    public void verificaMoeda(double tamanho) {
        if(tamanho == 1) {
            System.out.println("Moeda de R$ 0,01");
        } else {
            if(getSucessor() != null) {
                getSucessor().verificaMoeda(tamanho);
            } else {
                System.out.println("Moeda não reconhecida!");
            }
        }
        
    }
    
}
