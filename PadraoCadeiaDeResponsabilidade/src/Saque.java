
public abstract class Saque {
	private Saque sucessor;

	public Saque getSucessor() {
		return sucessor;
	}

	public void setSucessor(Saque sucessor) {
		this.sucessor = sucessor;
	}
	
	public abstract void processaSaque(int valor);
}
