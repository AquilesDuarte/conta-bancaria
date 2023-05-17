import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente na conta " + numeroConta);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        ContaBancaria conta = new ContaBancaria(numeroConta);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        double saldo = conta.getSaldo();
        System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);

        scanner.close();
    }
}