public class Cliente {
    private String cpf, nome, endereco, anoNascimento;

    public Cliente(String cpf, String nome, String endereco, String anoNascimento) {
        setCpf(cpf);
        setNome(nome);
        setEndereco(endereco);
        setAnoNascimento(anoNascimento);
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
