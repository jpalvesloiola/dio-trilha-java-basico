import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //ToDo:

        //Conhecer e importar a classe Sscanner
        
        //Exibir mensagens para nosso usu?rio

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a ag?ncia da conta:");
        String agencia = sc.nextLine();

        System.out.println("Digite o nome do respons?vel da conta:");
        String nome = sc.nextLine();

        System.out.println("Informe o quando deseja depositar:");
        float saldo = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ol? " + nome + ", obrigado por criar uma conta em nosso banco, sua ag?ncia ? " + agencia + ", conta " + numero + " e seu saldo " + saldo + " j? est? dispon?vel para saque.");

        sc.close();

    }
}
