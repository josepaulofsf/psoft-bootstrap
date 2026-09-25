import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private String nome;
    private List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Venda> vendas;
    private int geradorIdVenda;

    public Mercado(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
        this.geradorIdVenda = 1;
    }

    public Venda iniciarVenda(Cliente cliente) {
        Venda novaVenda = new Venda(geradorIdVenda++, cliente);
        this.vendas.add(novaVenda);
        return novaVenda;
    }

    public void registarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void registarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public double calcularFaturamentoTotal() {
        double faturamentoTotal = 0.0;
        for (Venda venda : vendas) {
            faturamentoTotal += venda.valorTotal();
        }
        return faturamentoTotal;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
}