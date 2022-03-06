//Client
public class Aplicacao{
    
    public static void main(String[] args){
        WidgetFactory factory = obterFactory(1);
        Botao botao = factory.criarBotao();
        botao.desenhar();
        Janela janela = factory.criarJanela();
        janela.desenhar();
        
        WidgetFactory factory2 = obterFactory(2);
        Botao botao2 = factory.criarBotao();
        botao2.desenhar();
        Janela janela2 = factory.criarJanela();
        janela2.desenhar();
    }
    
    public static WidgetFactory obterFactory(int x){
        if(x==1){
            return new MotifWidgetFactory();
        }
        else{
            return new QtWidgetFactory();
        }
    }
}