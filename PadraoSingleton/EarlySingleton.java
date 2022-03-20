public class EarlySingleton {    
    private static EarlySingleton instancia = new EarlySingleton();
    
    private EarlySingleton () { 
        super();
    }    
    
    public static EarlySingleton getInstance() {
        return instancia;    
    }

} 