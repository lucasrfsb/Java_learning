import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        float Saldo;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        Agencia = scanner.next();

        System.out.println("Por favor, digite o número do seu saldo: ");
        Saldo = scanner.nextFloat();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco," +
                        " sua agência é %s," +
                        " conta %d" +
                        " e seu saldo %.2f já está disponível para saque\n",
                NomeCliente, Agencia, Numero, Saldo);

    }
}