/* 
 * O método execute() de um comando composto deve varrer a lista de comandos 
 * do bloco e executar cada um deles.
 */
public class ComandoComposto extends Comando 
{
    Comando comandos[];
    
    public ComandoComposto(String nome[] , int n){
        super(nome.toString());
        comandos = new Comando[n];
        for(int i=0; i<comandos.length; i++){
            comandos[i] = new ComandoSimples(nome[i]);
        }
    }
    
    public void execute(){
        for(int i=0; i<comandos.length; i++){
            comandos[i].execute();
        }
    }
}
