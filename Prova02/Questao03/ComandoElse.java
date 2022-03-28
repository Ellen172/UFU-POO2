
public class ComandoElse extends ComandoCondicional
{
    Comando comando;
    
    public ComandoElse(String nome, Comando comandoelse){
        super(nome, null, comandoelse);
        this.comando = comandoelse;
    }
    
    public void execute(){
        comando.execute();
    }
}
