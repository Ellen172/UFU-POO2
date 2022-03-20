public class LightOnCommand implements Command {
    Light light; 
    
    // Receiver já conhecido pelo concrete command
    // Light light = new light();
    
    // Receiver informado pelo client
    public LightOnCommand(Light light) { 
        this.light = light; 
    } 
    
    public void execute() { 
        this.light.on(); 
    } 
}
