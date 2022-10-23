import java.util.Scanner;

public class ex4ImparePar{
    public static void main(String[] args){
        /*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
        Scanner sc = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int quantImpar = 0, quantPar = 0;

        int count = 0;
        
        System.out.print("Quantos numeros voce quer: ");
        quantNumeros = sc.nextInt();
        
        do{
            System.out.print("Digite um numero: ");
            
            numero = sc.nextInt();
            
            if (numero % 2 == 0){
                quantPar++;
            }else quantImpar++;
            
            count++;
        }while(count < quantNumeros); 

        System.out.println("Numero par: "+ quantPar);
        System.out.println("Numero impar:" + quantImpar);
    }
}