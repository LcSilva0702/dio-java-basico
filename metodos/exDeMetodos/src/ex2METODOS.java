public class ex2METODOS {
    
    public static void msg(int hora){
        switch(hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            msgBomDia();
            break;

            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            msgBoaTarde();
            break;

            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            msgBoaNoite();
            break;} 
        }
    public static void msgBomDia() {
        System.out.println("Bom dia!!!");
    }
    public static void msgBoaTarde(){
        System.out.println("Boa tarde!!!");
    }
    public static void msgBoaNoite(){
        System.out.println("Boa noite!!!");
    }
}
