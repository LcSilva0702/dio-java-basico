import java.util.Scanner;

public class ex1NomeIdade{
    public static void main(String[] args) {
        /*
    Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare inserindo o valor 0 no campo nome)
    */
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = sc.next();
            if (nome.equals("0")){
                break;
            }
            
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            
            
            System.out.println("Nome:" + nome + "- Idade: " + idade);
        }

    }
}
