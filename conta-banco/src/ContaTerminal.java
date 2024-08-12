import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber os dados do usuário via
        // terminal/console
        Scanner scanner = new Scanner(System.in);

        // Solicitação das informações ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpando o buffer do Scanner antes de receber uma string
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final simulando a criação da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                + " já está disponível para saque.");

        // Fechando o Scanner
        scanner.close();
    }
}
