

public abstract class Estado
{
    private Produto prod;
    
    public Estado(Produto prod){
        setProd(prod);
    }
    
    public Produto getProd(){
        return prod;
    }
    public void setProd(Produto prod){
        this.prod = prod;
    }
    
    public abstract void verificaEstado();
    
    public void compra(int nro) {
        this.prod.setQtd(this.prod.getQtd()+nro);
	this.verificaEstado();
	
    }
    public void venda(int nro) {
        if(this.prod.getQtd()-nro < 0){
            System.out.println("Estoque insuficiente para a venda!");
        } else {
            this.prod.setQtd(this.prod.getQtd()-nro);
        }
        this.verificaEstado();
    }
}
