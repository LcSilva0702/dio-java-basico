import java.util.Scanner;

public class ex2Nota {
    public static void main(String[] args) {
            /*
        Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido
        e continue pedindo
        até que o usuário informe um valor válido.
        */

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota de 0 a 10");
        nota = sc.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota invalida");
            System.out.println("Tente novamente, nota: ");
            nota = sc.nextInt();
        }

        System.out.println("Nota:" + nota);
    
    }
}
