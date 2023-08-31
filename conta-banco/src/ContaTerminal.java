import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua agência");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("olá" + nome + " " + sobrenome + ",");
        System.out.println(" sua agência é " + agencia + ",");
        System.out.println(" conta " + conta);
        System.out.println(" e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
