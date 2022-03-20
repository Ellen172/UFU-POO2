public class LazySingleton {    
    private static LazySingleton instancia = null;
    
    private LazySingleton () { 
         super();
    }    
    
    public static synchronized LazySingleton getInstance() {
        if (instancia == null) 
            instancia = new LazySingleton();   
        return instancia;    
    }
} 