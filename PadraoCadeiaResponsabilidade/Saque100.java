// ConcrectHandler
public class Saque100 extends Saque {
	public void processaSaque(int valor){
		int notas = valor/100; // quantas notas de 100 serão dadas
		int resto = valor%100; // quais notas sobrarão para ser dadas
		
		if(notas != 0)
			System.out.println("Quantidade de notas de 100: " + notas);
			
		if(resto != 0 && getSucessor() != null) 
			getSucessor().processaSaque(resto); // se ainda tiver resto, precisaremos de outras notas
	}
}