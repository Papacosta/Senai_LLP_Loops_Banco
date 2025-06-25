public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criar contas
        ContaCorrente cc = new ContaCorrente("001", "João", 2.5);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 0.05);

        // Abrir contas
        banco.abrirConta(cc);
        banco.abrirConta(cp);

        // Realizar operações
        banco.realizarOperacao("001", "deposito", 100.0);
        banco.realizarOperacao("002", "deposito", 200.0);
        banco.realizarOperacao("001", "saque", 50.0);
        banco.realizarOperacao("002", "saque", 30.0);

        // Aplicar rendimento (somente para poupança)
        ContaBancaria contaMaria = banco.buscarConta("002");
        if (contaMaria instanceof ContaPoupanca) {
            ((ContaPoupanca) contaMaria).aplicarRendimento();
        }

        // Mostrar contas
        System.out.println("\n=== LISTA DE CONTAS ===");
        banco.listarContas();
    }
}
