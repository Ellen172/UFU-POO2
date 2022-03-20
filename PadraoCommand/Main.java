
public class Main
{
    Light luz = new Light();
    RemoteControl controle = new RemoteControl();
    
    Command offLight = new LightOffCommand();
    Command onLight = new LightOnCommand();

    controle.setCommand();
    
}
