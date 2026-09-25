public class Cliente {
    private String nome;
    private String cpf;
    private Assinatura perfil;
    
    public Cliente(String nome, String cpf, Assinatura perfil) {
        this.nome = nome;
        this.cpf = cpf;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Assinatura getPerfil() {
        return perfil;
    }

    public void setPerfil(Assinatura perfil) {
        this.perfil = perfil;
    }
}

