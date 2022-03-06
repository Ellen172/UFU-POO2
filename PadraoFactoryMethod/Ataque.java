
public abstract class Ataque
{
    private String ataqueNome;
    
    public void setAtaqueNome(String ataqueNome){
        this.ataqueNome = ataqueNome;
    }
    public String getAtaqueNome(){
        return ataqueNome;
    }
    
    public void atacar(Personagem personagem){
        System.out.println("Tipo de ataque: " + getAtaqueNome());
    }
}
