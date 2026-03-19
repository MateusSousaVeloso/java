
import java.util.Random;

public class TesteConta {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        ContaBancaria c1 = new ContaBancaria("Ana", "1001", 1000.00);
        ContaBancaria c2 = new ContaBancaria("Bruno", "1002", 1000.00);

        ContaBancaria ativa, destino;
        while (true) {
            int sorteioConta = random.nextInt(2);
            if (sorteioConta == 0) {
                ativa = c1;
                destino = c2;
            } else {
                ativa = c2;
                destino = c1;
            }

            int operacao = random.nextInt(3);
            double valor = random.nextDouble() * (500.0 - 1.0);
            String operacaoNome = null;
            switch (operacao) {
                case 0:
                    ativa.depositar(valor);
                    operacaoNome = "DEPOSITO";
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso.", valor);

                    break;
                case 1:
                    ativa.sacar(valor);
                    operacaoNome = "SAQUE";
                    System.out.printf("Saque de R$ %.2f realizado com sucesso.", valor);

                    break;
                case 2:
                    ativa.transferir(destino, valor);
                    operacaoNome = "TRANSFERÊNCIA";
                    System.out.printf("Transferência de R$ %.2f realizado com sucesso para a conta do %s.", valor, destino.getTitular());
                    break;
            }

            System.out.println("\n=== Operacao: " + operacaoNome + " na conta de " + ativa.getTitular() + " ===");
            c1.exibirExtrato();
            c2.exibirExtrato();

            Thread.sleep(1000);
        }
    }
}
