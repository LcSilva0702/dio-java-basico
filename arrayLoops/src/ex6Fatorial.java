import java.util.Scanner;

public class ex6Fatorial {
    public static void main(String[] args){
        /*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
        Scanner sc = new Scanner(System.in);
        int fatorial; 

        fatorial = sc.nextInt();
        
        int conta = 1;
        
        System.out.print(fatorial + "!= ");
        for(int i = fatorial ;1 <= i; i--){
            conta = conta * i;
        }

        System.out.println(conta);
    }
}
