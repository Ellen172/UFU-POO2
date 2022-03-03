//ConcreteDecorator
public class RodaLigaLeve extends CarroDecorador {
    public RodaLigaLeve(Carro carroDecorado) {
        super(carroDecorado);
        setCusto(200.00);
        setDescricao("Roda Liga Leve");
    }
}