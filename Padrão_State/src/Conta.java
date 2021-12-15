
public class Conta {
	private Estado estado;
	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		setNumero(numero);
		setEstado(new EstadoPrata(this));
		setSaldo(0.0);
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(double quantia) {
		estado.depositar(quantia);
		System.out.println("Depósito---" + quantia);
		System.out.println("Saldo = " + this.getSaldo());
		System.out.println("Estado = " + this.estado.getClass().getName());
	}
	
	public void sacar(double quantia) {
		estado.sacar(quantia);
		System.out.println("Depósito---" + quantia);
		System.out.println("Saldo = " + this.getSaldo());
		System.out.println("Estado = " + this.estado.getClass().getName());
	}
	
}
