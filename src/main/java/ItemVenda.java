public class ItemVenda {
    private Produto produto;
    private int quantidade;
    
    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemVenda(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }

    public double subTotal(){
        return produto.getValorU() * this.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
