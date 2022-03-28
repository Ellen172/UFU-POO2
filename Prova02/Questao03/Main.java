

public class Main
{
    public static void main (String args[]){
        System.out.println("Iniciando..");
        
        // teste de comando simples
        Comando comando1 = new ComandoSimples("10+10");
        comando1.execute();

        // teste de comando composto
        // só com comandos simples
        String compostoSimples[] = {"20+10","2+4","3+5"};
        Comando comando2 = new ComandoComposto(compostoSimples,compostoSimples.length);
        comando2.execute();
        // com comandos composto #TODO
        String compostoComposto[] = {"20+10","2+4","3+5"}; 
        
        
        // teste de comando condicional
        // só com comandos simples
        Comando comando3 = new ComandoCondicional("condicional", new ComandoSimples("if"), new ComandoSimples("else"));
        comando3.execute();
        // com comando composto #TODO
    }
}
