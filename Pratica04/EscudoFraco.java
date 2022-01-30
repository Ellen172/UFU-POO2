
public class EscudoFraco extends Escudo
{
    private Personagem persona;
    
    public EscudoFraco(Personagem persona){
        setPersonagem(persona);
    }
    
    public void setPersonagem(Personagem persona){
        this.persona = persona;
    }
    public Personagem getPersonagem(){
        return persona;
    }
    
    public void diminuiAtaque(int perda){
        // diminui ataque
        perda = perda-2;
        // verifica sucessor
        if(getSucessor() != null)
            getSucessor().diminuiAtaque(perda);
        else persona.getLifeEstado().perdeVida(perda);
    }
}
