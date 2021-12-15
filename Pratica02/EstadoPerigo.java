
//  nível de energia do personagem está maior do que 0 e abaixo de 30%
public class EstadoPerigo extends LifeEstado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe EstadoPerigo
     */
    public EstadoPerigo()
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
