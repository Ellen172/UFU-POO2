//ConcreteDecorator
public class VidroEletrico extends CarroDecorador {
    public VidroEletrico(Carro carroDecorado) {
        super(carroDecorado);
        setCusto(600.00);
        setDescricao("Vidro Eletrico");
    }
}