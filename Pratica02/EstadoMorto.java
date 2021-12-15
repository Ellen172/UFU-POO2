// Se o nível de energia do personagem atingir 0
public class EstadoMorto extends LifeEstado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe EstadoMorto
     */
    public EstadoMorto()
    {
        // inicializa variáveis de instância
        x = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}
