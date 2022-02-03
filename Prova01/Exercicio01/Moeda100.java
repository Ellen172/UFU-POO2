
// moeda de 1,00 (1.8cm)
public class Moeda100 extends Moeda {

	public void verificaMoeda(double tamanho) {
		if(tamanho == 1.8) {
			System.out.println("Moeda de R$ 1,00");
		} else {
			if(getSucessor() != null) {
				getSucessor().verificaMoeda(tamanho);
			} else {
				System.out.println("Moeda n�o reconhecida!");
			}
		}
		
	}
}

