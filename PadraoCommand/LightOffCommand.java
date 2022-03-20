public class LightOffCommand implements Command {
    Light light;
    
    // Receiver já conhecido pelo concrete command
    // Light light = new light();
    
    // Receiver informado pelo client
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
}
