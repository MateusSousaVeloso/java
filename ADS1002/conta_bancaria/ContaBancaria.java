
public class ContaBancaria {

    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para deposito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("\nConta: %s; Titular: %s; Saldo: R$ %.2f\n", this.numero, this.titular, this.saldo);
    }

    public void exibirExtrato() {
        System.out.println("--- Extrato ---");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numero);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
        System.out.println("---------------\n");
    }

    String getTitular() {
        return this.titular;
    }
}
