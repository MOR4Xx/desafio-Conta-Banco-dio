import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contaBancaria = 0;
        String agenciaBancaria;
        String nomeCliente;
        double saldoCliente = 0;

        System.out.println("Digite o numero da conta: ");
        contaBancaria = sc.nextInt();
        System.out.println("Digite a agencia: ");
        agenciaBancaria = sc.nextLine();
        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Olá"+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaBancaria+", conta "+contaBancaria
                +"e seu saldo "+saldoCliente+" já está disponível para saque");

        sc.close();
    }
}
