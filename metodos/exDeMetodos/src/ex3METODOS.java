public class ex3METODOS {
    
    public static double txDuasParcelas(){
        return 0.2;
    }
    public static double txTresParcelas(){
        return 0.3;
    }

    public static void emprestimo(Double valor, int parcelas){
        if (parcelas == 2){
            valor = valor +(valor * txTresParcelas());
            System.out.println("O valor a ser pago para duas parcelas e: " + valor);
        } else if (parcelas == 3){
            valor = valor + (valor * txDuasParcelas());
            System.out.println("O valor a ser pago para duas parcelas e: " + valor);
        }else{
            System.out.println("quantidade invalida.");
        }
    }
}
