
public class EstadoPrata extends Estado {
	public EstadoPrata(Conta conta) {
		super(conta);
	}
	
	public void setLimites() {
		this.setLimiteInferior(0.0);
		this.setLimiteSuperior(1000.0);
	}
	
	// cliente paga taxa por saque realizado
	public void sacar(double quantia) {
		this.getConta().setSaldo(this.getConta().getSaldo()-quantia-5.00);
		this.verificarAlteracaoEstado();
	}
	
	public void verificarAlteracaoEstado() {
		if(this.getConta().getSaldo()<this.getLimiteInferior())
			this.getConta().setEstado(new EstadoVermelho(this.getConta()));
		else if(this.getConta().getSaldo()>this.getLimiteSuperior()) {
			this.getConta().setEstado(new EstadoOuro(this.getConta()));
		}
	}
}
