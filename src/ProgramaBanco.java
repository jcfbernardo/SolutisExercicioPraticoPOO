public class ProgramaBanco {
    public static void main(String[] args) {
        // Exemplo 1: Conta com um único titular, saldo inicial e limite baixo.
        Cliente unicoTitular = new Cliente("11111111111", "Titular Único", "Rua X, 789", "1985");
        ContaCorrente conta1 = new ContaCorrente("002", "Conta Simples", unicoTitular, 500, 1000);
        conta1.debito(200);
        conta1.credito(300);
        conta1.debito(700);
        conta1.resumo();

        // Exemplo 2: Conta com dois titulares, saldo inicial negativo e limite alto.
        Cliente primeiroTitular = new Cliente("22222222222", "Primeiro Titular", "Av. Y, 456", "1992");
        Cliente segundoTitular = new Cliente("33333333333", "Segundo Titular", "Rua Z, 789", "1994");
        ContaCorrente conta2 = new ContaCorrente("003", "Conta Premium", primeiroTitular, segundoTitular, -200, 5000);
        conta2.credito(1500);
        conta2.debito(300);
        conta2.debito(700);
        conta2.credito(1000);
        conta2.resumo();

        // Exemplo 3: Conta com dois titulares, saldo inicial e limite padrão.
        Cliente primeiroTitular2 = new Cliente("44444444444", "Titular Principal", "Rua Principal, 123", "1980");
        Cliente segundoTitular2 = new Cliente("55555555555", "Titular Secundário", "Rua Secundária, 456", "1988");
        ContaCorrente conta3 = new ContaCorrente("004", "Conta Padrão", primeiroTitular2, segundoTitular2, 1000, 2000);
        conta3.credito(800);
        conta3.debito(300);
        conta3.credito(500);
        conta3.debito(600);
        conta3.resumo();
    }
}
