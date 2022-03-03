//ConcreteDecorator
public class ArCondicionado extends CarroDecorador {
    public ArCondicionado(Carro carroDecorado) {
        super(carroDecorado);
        setCusto(900.00);
        setDescricao("Ar Condicionado");
    }
}