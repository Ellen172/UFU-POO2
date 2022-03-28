/* 
 * O método execute() de um comando simples deve mostrar o nome do comando, 
 * fornecido em seu construtor.
 */
public class ComandoSimples extends Comando
{    
    public ComandoSimples(String nome){
        super(nome);
    }
    
        public void execute(){
        System.out.println("Comando simples -> " + getNome());
    }
}
