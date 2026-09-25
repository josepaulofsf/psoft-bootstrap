import java.util.ArrayList;

public class Venda {
    private int idVenda;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    
    public Venda(int idVenda, Cliente cliente, ArrayList<ItemVenda> itens) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.itens = itens;
    }

    public Venda(int idVenda, Cliente cliente) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.itens = new ArrayList<ItemVenda>();
    }

    public double valorTotal(){
        double total = 0.0;
        double desconto = 0.0;

        for (ItemVenda item : itens){
            double soma = item.subTotal();
            int nItens = item.getQuantidade();
            total += soma;

            if (nItens >= 20){
                desconto += calculaDesconto(soma);
            }
        }

        if (cliente.getPerfil() == Assinatura.PREMIUM){
            desconto += (total/100)*5;
        }

        return total - desconto;
    }

    private double calculaDesconto(double valor){
        return (valor/100)*10;

    }

    public boolean realizarPagamento(String formaPagamento){
        Pagamento pagamento = new Pagamento(this, this.valorTotal(), formaPagamento);

        return pagamento.processar();
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    
}
