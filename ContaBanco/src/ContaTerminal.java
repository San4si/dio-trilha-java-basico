import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite o numero da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , 0brigado por criar uma conta em nosso banco!");

        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + ", já está disponível para saque.");
        
        scanner.close();
    }
}
