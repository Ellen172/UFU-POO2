
public class ComandoIf extends ComandoCondicional
{
    Comando comando;
    
    public ComandoIf(String nome, Comando comandoif){
        super(nome, comandoif, null);
        this.comando = comandoif;
    }
    
    public void execute(){
        comando.execute();
    }
}
