// ConcrectHandler
public class Saque25 extends Saque{
    public void processaSaque(int valor){
		int notas = valor/25; // quantas notas de 25 ser�o dadas
		int resto = valor%25; // quais notas sobrar�o para ser dadas
		
		if(notas != 0)
			System.out.println("Quantidade de notas de 25: " + notas);
			
		if(resto != 0 && getSucessor() != null) 
			getSucessor().processaSaque(resto); // se ainda tiver resto, precisaremos de outras notas
	}
}
