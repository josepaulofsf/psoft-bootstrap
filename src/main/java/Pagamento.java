public class Pagamento {
    private Venda venda;
    private double valor;
    private  String formaPagamento;
    
    public Pagamento(Venda venda, double valor, String formaPagamento) {
        this.venda = venda;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public boolean processar(){
        if(this.formaPagamento == null || this.formaPagamento == ""){
            return false;
        }
        return true;
    }

    public Venda getVenda() {
        return venda;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

}
