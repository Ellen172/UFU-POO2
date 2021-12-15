
public abstract class Estado {
	private Conta conta;
	private double limiteInferior;
	private double limiteSuperior;
	
	public Estado(Conta conta) {
		setConta(conta);
		setLimites();
	}
	
	protected abstract void setLimites();

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public double getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(double limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public double getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(double limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
	public void depositar(double quantia) {
		this.conta.setSaldo(this.conta.getSaldo()+quantia);
		this.verificarAlteracaoEstado();
	}
	
	public void sacar(double quantia) {
		this.conta.setSaldo(this.conta.getSaldo()-quantia);
		this.verificarAlteracaoEstado(); 
	}
	
	protected abstract void verificarAlteracaoEstado();
	
}
