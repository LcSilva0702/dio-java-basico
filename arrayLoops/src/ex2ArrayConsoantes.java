import java.util.Scanner;

public class ex2ArrayConsoantes {
    public static void main(String[] args){
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
        Scanner sc = new Scanner(System.in);
        String[] consoantes = new String [6];
        int quantidadesdeConsoantes = 0;

        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = sc.next();

            if ( !( letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u")) ){
            consoantes[count] = letra;
            quantidadesdeConsoantes++;
                }
            count++;
            System.out.println(quantidadesdeConsoantes);
        }while(count < consoantes.length);

        for(String consoante : consoantes ){
            if (consoante != null){
                System.out.println(consoante);
            }
        }
    }
}
