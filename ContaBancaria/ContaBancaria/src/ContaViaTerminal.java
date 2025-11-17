import java.util.Scanner;

public class ContaViaTerminal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
            int numeroDaConta = input.nextInt();

        System.out.println("Agora, digite a sua agência: ");
            String agenciaDaConta = input.nextLine();

        System.out.println("Digite nome: ");
            System.out.println("Nome = ");
            String nome = input.nextLine();
                //  System.out.println("Seu nome está correto ? (Digite 'S' para Sim ou 'N' para Não :" + nome);
                //     String confirmacaoNome = input.nextLine();
                //     if(confirmacaoNome == "N" || confirmacaoNome =="n"){
                //         System.out.println("Digite seu nome novamente: ");
                //         String nomeNovo = input.nextLine();
                //     } 
            System.out.println("Agora, digite seu sobrenome: ");
                System.out.println("Sobrenome = ");
                String sobrenome = input.nextLine();
                // System.out.println("Seu sobrenome está correto ? (Digite 'S' para Sim ou 'N' para Não :" + nome);
                // String confirmacaoSobreome = input.nextLine();
                // if(confirmacaoSobreome == "N" || confirmacaoSobreome =="n"){
                    //     System.out.println("Digite seu sobrenome novamente: ");
                    //     String sobrenomeNovo = input.nextLine();
                    // }
                    
                    System.out.printf("Seja muito bem-vindo %s %s",nome,sobrenome);
        input.close();
    }
}