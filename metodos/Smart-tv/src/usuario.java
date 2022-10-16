public class usuario {
    public static void main(String[] args) throws Exception {
        
        smarttv smarttv = new smarttv(); 
        
        System.out.println("Tv ligada:" + smarttv.ligada);
        System.out.println("Canal atual:" + smarttv.canal);
        System.out.println("Volume atual:" + smarttv.volume);
    }
}
