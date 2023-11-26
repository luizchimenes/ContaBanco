import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaTerminal novaConta = new ContaTerminal();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numConta = scan.nextInt();
        novaConta.setNumero(numConta);

        System.out.println("Digite o número da agencia: ");
        String numAgencia = scan.next();
        novaConta.setAgencia(numAgencia);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scan.nextLine();
        novaConta.setNomeCliente(nomeCliente);

        System.out.println("Digite seu saldo atual: ");
        double saldoAtual = scan.nextDouble();
        novaConta.setSaldo(saldoAtual);

        System.out.println("Bem vindo," + novaConta.getNomeCliente());
        System.out.println("Número da Conta: " + novaConta.getNumero());
        System.out.println("Agencia: " + novaConta.getAgencia());
        System.out.println("Saldo atual: " + novaConta.getSaldo());

    }
}