import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int mes;

        System.out.println("Digite o numero de um mes");
        
        Scanner sc = new Scanner(System.in);

        mes = sc.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        }   
            else if (mes == 2){
                System.out.println("Fevereiro");
            }   
            else if(mes == 3){
                System.out.println("Marco");
            }   
            else if (mes == 4){
                System.out.println("Abril");
            }
            else if (mes == 5){
                System.out.println("Maio");
            }
            else if (mes == 6){
                System.out.println("Junho");
            }
            else if (mes == 7){
                System.out.println("Julho");
            }
            else if (mes == 8){
                System.out.println("Agosto");
            }
            else if (mes == 9){
                System.out.println("Setembro");
            }
            else if (mes == 10){
                System.out.println("Outubro");
            }
            else if (mes == 11){
                System.out.println("Novembro");
            }
            else if (mes == 12){
                System.out.println("Dezembro");
            }
        
        if (mes == 7){
            System.out.println("FERIAS");
        } 
            else if (mes == 11){
                System.out.println("FERIAS");
            } 
            else if (mes == 1){
                System.out.println("FERIAS");
            }
            else{
                System.out.println("Ainda nao e ferias :-(");
            }

    ////////////////switch///////////////////////
        int dia;
        
        System.out.println("Digite o numero de um dia:");

        dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira"); 
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        //exercio dois de switch
        int numero;

        System.out.println("Digite um numero de 1 a 5:");

        numero = sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("Certo");
                break;
            case 2:
                System.out.println("Certo");
                break;
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Talvez");
                break;
            case 5:
                System.out.println("Errado");
                break;
        }
    }
}
