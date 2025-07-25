import java.util.Scanner;
public class ContaTerminal{
	
	
    public static void main(String[] args) throws Exception {
        /* TODO: 
         * Atributo	Tipo	Exemplo
         * Numero	Inteiro	1021
         * Agencia	Texto	067-8
         * Nome Cliente	Texto	MARIO ANDRADE
         * Saldo	Decimal	237.48*/
    	
    	int numConta;
    	String agencia;
    	String nomeCliente;
    	double saldo;
    	
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.print("Digite o númreo da Agência");
    	 agencia = scanner.nextLine();

         System.out.print("Digite um número da conta: ");
         numConta = scanner.nextInt();
         scanner.nextLine();
         
    	 System.out.print("Digite o nome do cliente");
    	 nomeCliente = scanner.nextLine();

         System.out.print("Digite o valor do depósito saldo inicial ");
         saldo = scanner.nextDouble();
         scanner.nextLine();


         System.out.print("Olá ");
         System.out.print(nomeCliente);
         System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é ");
         System.out.print(agencia);
         System.out.print(", conta ");
         System.out.print(numConta);
         System.out.print(" e seu saldo R$");
         System.out.print(saldo);
         System.out.print(" já está disponível para saque");
      

         scanner.close();
    }
}
