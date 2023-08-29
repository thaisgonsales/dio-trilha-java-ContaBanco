import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia!");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu nome!");
        String titularNome = scanner.next();

        System.out.println("Por favor digite o valor a depositar!");
        double valorSaldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + titularNome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numeroConta + ", e o seu saldo é " + valorSaldo + " já está disponível para saque.");
    }
}
