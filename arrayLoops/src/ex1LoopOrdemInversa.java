public class ex1LoopOrdemInversa{
    public static void main(String[] args){

        int[] arrayTst = {0,1,2,3,4,5};

        int count = 0;
        
  
        
        while(count < (arrayTst.length)){
            System.out.println(arrayTst[count]);
            count++;
        }
        
     
        for(int i = (arrayTst.length - 1) ; i >= 0; i--){
            System.out.println(arrayTst[i] + " ");
            
        }
    }
}