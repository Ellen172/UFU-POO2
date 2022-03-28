
public abstract class Comando implements Entrada
{
    String nome; // nome do comando
    
    public Comando(String nome){
        setNome(nome);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
