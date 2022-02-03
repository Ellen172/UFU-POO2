

public class Main {
	public static void main(String [] args) {
		Moeda moeda001 = new Moeda001();
		Moeda moeda005 = new Moeda005();
		Moeda moeda010 = new Moeda010();
		Moeda moeda050 = new Moeda050();
		Moeda moeda100 = new Moeda100();
		
		moeda001.setSucessor(moeda005);
		moeda005.setSucessor(moeda010);
		moeda010.setSucessor(moeda050);
		moeda050.setSucessor(moeda100);
		
		moeda001.verificaMoeda(1.0); // moeda de 0,01
		moeda001.verificaMoeda(1.2); // moeda de 0,05
		moeda001.verificaMoeda(1.4); // moeda de 0,10
		moeda001.verificaMoeda(1.6); // moeda de 0,50
		moeda001.verificaMoeda(1.8); // moeda de 1,00
		moeda001.verificaMoeda(1.9); // inexistente
	}
}
