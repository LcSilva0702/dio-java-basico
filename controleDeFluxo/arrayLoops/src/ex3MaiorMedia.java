import java.util.Scanner;

public class ex3MaiorMedia{
    public static void main(String[] args){
        /*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
        Scanner sc = new Scanner(System.in);

        double maior = 0;
        double soma = 0;
        double media;

        int count = 0;

        do {

            System.out.println("Numero: ");
            double numero = sc.nextDouble();
            
            if (numero > maior){
                maior = numero;
            }
            soma = soma + numero;

            count++;
        
        } while (count < 5);

        media = soma / 5;

        System.out.println("Maior:" + maior + " / Media:" + media);
    }
}