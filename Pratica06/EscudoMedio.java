
public class EscudoMedio extends Escudo
{
    private Personagem personagem;
    
    public EscudoMedio(Personagem personagem){
        setPersonagem(personagem);
    }
    
    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    public Personagem getPersonagem(){
        return personagem;
    }
    
    public void diminuiAtaque(int perda){
        // diminui ataque
        perda = perda-2;
        if(perda < 0 ) perda = 0; 
        
        // verifica sucessor
        if(getSucessor() != null)
            getSucessor().diminuiAtaque(perda);
        else personagem.getEstado().perdeVida(perda);
    }
}
