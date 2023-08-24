import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia !");
        int numero = ler.nextInt();
        ler.nextLine();
        System.out.println("Por favor,informe a Agencia !");
        String agencia = ler.nextLine();


        System.out.println("Por favor, informe seu nome !");
        String nomeCliente = ler.nextLine();

        System.out.println("Por favor, informe seu saldo !");
        double saldo = ler.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia "+agencia+", conta "+numero+" e seu saldo "+saldo+" esta disponivel para saque.");
    }
}
