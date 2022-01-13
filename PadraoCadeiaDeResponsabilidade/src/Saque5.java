// ConcrectHandler
public class Saque5 extends Saque{
    public void processaSaque(int valor){
		int notas = valor/5; // quantas notas de 5 ser�o dadas
		int resto = valor%5; // quais notas sobrar�o para ser dadas
		
		if(notas != 0)
			System.out.println("Quantidade de notas de 5: " + notas);
			
		if(resto != 0 && getSucessor() != null) 
			getSucessor().processaSaque(resto); // se ainda tiver resto, precisaremos de outras notas
	}
}
