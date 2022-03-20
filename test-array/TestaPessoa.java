
import java.util.ArrayList;

public class TestaPessoa {
	public static void main(String args[]) {
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa(); 
		p1.setNome("Bruno");
		p1.setIdade(34);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Carla");
		p2.setIdade(23);
		
		lista.add(p1);
		lista.add(p2);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Idade: " + lista.get(i).getIdade());
			System.out.println("\n");
		}
		
		lista.remove(p1);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Idade: " + lista.get(i).getIdade());
			System.out.println("\n");
		}
	}
}