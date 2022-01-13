public class CaixaEletronico {
    public static void main(String args[]){
        // instanciar objetos
        Saque saque100 = new Saque100();
        Saque saque50 = new Saque50();
        Saque saque25 = new Saque25();
        Saque saque10 = new Saque10();
        Saque saque5 = new Saque5();

        // criar cadeia - encadear os objetos da cadeia
        saque100.setSucessor(saque50);
        saque50.setSucessor(saque25);
        saque25.setSucessor(saque10);
        saque10.setSucessor(saque5);
        saque5.setSucessor(null);

        // processar saques
        saque100.processaSaque(575);
        saque100.processaSaque(175);
        saque100.processaSaque(120);
        saque100.processaSaque(155);
        saque100.processaSaque(930);
    }
}
