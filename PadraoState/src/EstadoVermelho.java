
public class EstadoVermelho extends Estado{
	public EstadoVermelho(Conta conta) {
		super(conta);
	}
	
	public void setLimites() {
		setLimiteInferior(-100.0);
		setLimiteSuperior(0.0);
	}

	// não permite saque
	public void sacar(double quantia) {
		System.out.println("Não existem fundos disponiveis para saque!");
	}
	
	@Override
	protected void verificarAlteracaoEstado() {
		if(this.getConta().getSaldo()>this.getLimiteSuperior()) {
			this.getConta().setEstado(new EstadoPrata(this.getConta()));
			this.getConta().getEstado().verificarAlteracaoEstado();
		}
	}
}
