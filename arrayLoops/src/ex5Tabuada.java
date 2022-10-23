import java.util.Scanner;

public class ex5Tabuada{
    public static void main(String[] args){
        /*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
        Scanner sc = new Scanner(System.in);

        int numero;
        int tabuada;

        System.out.print("digite um numero para ver sua tabuada:");
        numero = sc.nextInt();

        for (int vezes = 1; vezes <= 10; vezes = vezes + 1){
            tabuada = numero * vezes;
            
            System.out.println(numero + "x" + vezes + "=" + tabuada);
        }
    }
}