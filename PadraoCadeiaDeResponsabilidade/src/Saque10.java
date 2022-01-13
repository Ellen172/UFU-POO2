// ConcrectHandler
public class Saque10 extends Saque{
    public void processaSaque(int valor){
		int notas = valor/10; // quantas notas de 10 ser�o dadas
		int resto = valor%10; // quais notas sobrar�o para ser dadas
		
		if(notas != 0)
			System.out.println("Quantidade de notas de 10: " + notas);
			
		if(resto != 0 && getSucessor() != null) 
			getSucessor().processaSaque(resto); // se ainda tiver resto, precisaremos de outras notas
	}
}
