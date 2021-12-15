
public class Client {
	public static void main(String [] args) {
		// abrir nova conta
		Conta conta = new Conta("2923903");
		
		// efetuar transações financeiras
		conta.depositar(500.0);
		conta.depositar(300.0);
		conta.depositar(550.0);
		conta.depositar(550.0);
		conta.sacar(2000.0);
		conta.sacar(1100.0);
	}
}
