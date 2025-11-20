


import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite um valor");
            int valor1 = input.nextInt();
            System.out.println("Digite outro valor");
            int valor2 = input.nextInt();
    
            int resultado = valor1 - valor2;
            System.out.println("O seu contador será de %d números inteiros" + resultado);
    
            for(int i = 0; i < resultado; i++){
                System.out.println(i);
            }

        } catch(Exception erro){
            System.out.println(erro.getMessage());
        }
        input.close();
    }
}
