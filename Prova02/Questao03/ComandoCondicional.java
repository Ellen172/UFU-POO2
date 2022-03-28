/* 
 * O método execute() de um comando condicional deve gerar um número 
 * aleatório entre 0 e 1. Caso o resultado seja menor que 0,5, 
 * o if deve ser executado. Caso contrário, o else deve ser executado
 */
public class ComandoCondicional extends Comando 
{    
    Comando comandoif, comandoelse;
    
    public ComandoCondicional(String nome, Comando comandoif, Comando comandoelse){
        super(nome);
        this.comandoif = comandoif;
        this.comandoelse = comandoelse;
    }
    
    public void execute(){
        double n = Math.random(); // numero de 0 a 1
        if(n < 0.5){
            System.out.println("Entrou no if");
            ComandoIf comandoIf = new ComandoIf(super.getNome(), comandoif);
            comandoIf.execute();
        } else {
            System.out.println("Entrou no else");
            ComandoElse comandoElse = new ComandoElse(super.getNome(), comandoelse);
            comandoElse.execute();
        }
    }
}
