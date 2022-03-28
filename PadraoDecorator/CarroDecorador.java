
//Decorador
public abstract class CarroDecorador extends Carro {
    private Carro carroDecorado;
    public CarroDecorador(Carro carroDecorado) {
        this.carroDecorado = carroDecorado;
    }
    
    public double getCusto() {
        return carroDecorado.getCusto() + super.getCusto();
    }
    public String getDescricao() {
        return carroDecorado.getDescricao() + ", "+ super.getDescricao();
    }
}
