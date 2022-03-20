
public class RemoteControl
{
    Light light = new Light();    
    Command comando;
    
    public void setCommand(Command comando){
        this.comando = comando;
    }
    
    public Command getCommand(){
        return comando;
    }
    
    public void botaoPressionado(){
        comando.execute();
    }

}
