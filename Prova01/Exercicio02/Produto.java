
public class Produto
{
    private Estado state;
    private int qtd;
    
    public Produto(){
        setQtd(0);
        setState(new Indisponivel(this));
    }
    
    public Estado getState(){
        return state;
    }
    public void setState(Estado state){
        this.state = state;
    }
    public int getQtd(){
        return qtd;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    
    public void venda(int nro) {
        System.out.println("Venda de "+nro+" produto(s)");
        if(this.state.getClass().getName()=="Indisponivel"){
            System.out.println("--Venda Indisponivel--");
        }
        else if (this.qtd-nro<0){
            System.out.println("Estoque insuficiente para a venda!");
        }
        else {
            state.venda(nro);
            System.out.println("Qtd em estoque: "+this.qtd);
            System.out.println("Estado atual: "+this.state.getClass().getName());
            if(this.state.getClass().getName()=="Indisponivel"){
                System.out.println("--Necessario repor estoque--");
            }
        }
        System.out.println();
    }
    public void compra(int nro) {
        System.out.println("Compra de "+nro+" produto(s)");
        state.compra(nro);
        System.out.println("Qtd em estoque: "+this.qtd);
        System.out.println("Estado atual: "+this.state.getClass().getName());
        if(this.state.getClass().getName()=="Indisponivel"){
            System.out.println("--Necessario repor estoque--");
        }
        System.out.println();
    }
}
