public class Produto {
    private int codigo;
    private String nome;
    private double valorU;
    
    public Produto(int codigo, String nome, double valorU) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorU = valorU;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }

}
