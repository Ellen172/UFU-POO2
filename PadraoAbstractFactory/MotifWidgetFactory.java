//concrete factory
class MotifWidgetFactory extends WidgetFactory{
    
    public Botao criarBotao(){
        return new BotaoMotif();
    }
    
    public Janela criarJanela(){
        return new JanelaMotif();
    }
}