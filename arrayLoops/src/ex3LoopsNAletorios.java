import java.util.Random;

public class ex3LoopsNAletorios {
    public static void main(String[] args){
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];
        
        for(int i = 0 ; i < numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("\nNumeros aletorios: ");
        
        for(int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero + 1)+ " ");
        }
        System.out.print("\nAntecessores: ");
        for(int numero : numerosAleatorios){
            System.out.print((numero - 1)+ " ");
        }
    }
}    
