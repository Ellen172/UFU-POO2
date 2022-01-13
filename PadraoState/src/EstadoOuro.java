
public class EstadoOuro extends Estado{
	public EstadoOuro(Conta conta) {
		super(conta);
	}
	
	public void setLimites() {
		this.setLimiteInferior(1000.0);
		this.setLimiteSuperior(10000000.0);
	}
	
	// ganha rendimento a cada deposito
	public void depositar(double quantia) {
		this.getConta().setSaldo(this.getConta().getSaldo()+(quantia*1.01));
	}
	
	public void verificarAlteracaoEstado() {
		if(this.getConta().getSaldo()<0.0) {
			this.getConta().setEstado(new EstadoVermelho(this.getConta()));
		}
		else if(this.getConta().getSaldo()<this.getLimiteInferior()) {
			this.getConta().setEstado(new EstadoPrata(this.getConta()));
		}
	}
}
