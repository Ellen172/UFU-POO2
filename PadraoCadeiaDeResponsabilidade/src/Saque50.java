// ConcrectHandler
public class Saque50 extends Saque {
    public void processaSaque(int valor){
		int notas = valor/50; // quantas notas de 50 serão dadas
		int resto = valor%50; // quais notas sobrarão para ser dadas
		
		if(notas != 0)
			System.out.println("Quantidade de notas de 50: " + notas);
			
		if(resto != 0 && getSucessor() != null) 
			getSucessor().processaSaque(resto); // se ainda tiver resto, precisaremos de outras notas
	}
}
