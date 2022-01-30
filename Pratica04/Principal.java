
public class Principal
{
    public static void main(String args[])throws InterruptedException {
        Personagem persona = new Personagem();
        //instanciar escudos
        Escudo escudoFraco = new EscudoFraco(persona);
        Escudo escudoMedio = new EscudoMedio(persona);
        Escudo escudoForte = new EscudoForte(persona);
        // definir sucessores
        escudoForte.setSucessor(escudoMedio);
        escudoMedio.setSucessor(escudoFraco);
        escudoFraco.setSucessor(null);
        
        System.out.println("Iniciando..");
        Painel p = new Painel(persona, escudoFraco, escudoMedio, escudoForte);
        p.jogar(p);
    }
}
