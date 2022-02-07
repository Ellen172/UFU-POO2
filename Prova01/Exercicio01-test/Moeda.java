
public abstract class Moeda {
	private Moeda sucessor;
	
	public Moeda getSucessor() {
		return sucessor;
	}
	public void setSucessor(Moeda sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void verificaMoeda(double tamanho);
}

