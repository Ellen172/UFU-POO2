// moeda de 0,05 (1,2cm)
public class Moeda005 extends Moeda{

	public void verificaMoeda(double tamanho) {
		if(tamanho == 1.2) {
			System.out.println("Moeda de R$ 0,05");
		} else {
			if(getSucessor() != null) {
				getSucessor().verificaMoeda(tamanho);
			} else {
				System.out.println("Moeda n�o reconhecida!");
			}
		}
		
	}
}
