public class ContaCorrente {

    private String numero, tipo;
    private Cliente primeiroTitular, segundoTitular;
    private double saldo = 0;
    private double limiteTotal = 0;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal) {
        setNumero(numero);
        setTipo(tipo);
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        setSaldo(saldo);
        setLimiteTotal(limiteTotal);
    }

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, double saldo, double limiteTotal) {
        setNumero(numero);
        setTipo(tipo);
        this.primeiroTitular = primeiroTitular;
        setSaldo(saldo);
        setLimiteTotal(limiteTotal);
    }

    public String resumo() {
        String resumo = "Numero da Conta Corrente: " + getNumero() + "\n"
                + "Nome do primeiro titular: " + primeiroTitular.getNome() + "\n";

        if (segundoTitular != null) {
            resumo += "Nome do segundo titular: " + segundoTitular.getNome() + "\n";
        }

        resumo += "Saldo Atual: " + getSaldo() + "\n"
                + "Limite Atual (limite total + saldo atual): " + (getLimiteTotal() + getSaldo()) + "\n"
                + "Limite Total: " + getLimiteTotal();

        if (estaDevedor()) {
            resumo += "\nProcure o seu gerente!";
        }

        System.out.println(resumo);
        return resumo;
    }


    public void credito(double valor) {
        setSaldo(valor);
    }
    public void debito(double valor) {
        setSaldo(getSaldo() - valor);
    }
    public String getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimiteTotal() {
        return limiteTotal;
    }
    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public boolean estaDevedor() {
        return (this.getSaldo() < 0);
    }
}
