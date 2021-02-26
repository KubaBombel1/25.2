
package zadanie.pkg4;


public class Zadanie4 {

   
   public static int[][] TAB(){
        int U = 9;
        
        
     int[][] TAB = new int[U][U];
        
        

            for (int L = 0; L < U; L++)
        
     {
            
         for (int K = 0; K < U; K++)
             
            
            {
                
                
                TAB[L][K] = L+K;
                
                
       }
         
         
        }
            
            
        return TAB;
    }
   
   
    public static void main(String[] args)
    
    {
        
        int[][] TAB = TAB();
        
        
        for (int F = 0; F < TAB.length; F++)
        
        {
            
            for (int T = 0; T < TAB.length; T++)
            
     {
                
                
                    System.out.print(TAB[F][T]+ " ");
     }
            
            
            
           System.out.println("");
      
       
       
        }
        
        
            }

}