
package zadanie.pkg3;
import java.util.Scanner;
import java.util.Arrays;
public class Zadanie3 

{

  
 public static int[] Zadanie3() 
 {
        Scanner scannner = new Scanner(System.in);
        
        
        System.out.println("Wpisz wielkość swojej tablicy");
        
        int Rozmiar;
        
        
        Rozmiar = scannner.nextInt();
        
        
        int[] tab1 = new int[Rozmiar];
        
        
        
   int[] tab2 = new int[Rozmiar];
        
        
        
                 int[] tab3 = new int[Rozmiar];
        
        

        for (int L = 0; L < Rozmiar; L++) 
            
            
        
        {
            
           System.out.println("Wpisz swoja liczbę " + L + " ");
            
            
            tab1[L] = scannner.nextInt();
     }
        
        
        for (int L = 0; L < Rozmiar; L++) 
            
            
        
                {
                    
                    
            System.out.println("Wpisz swoją liczbę " + L + "");
            
            
            tab2[L] = scannner.nextInt();
 }
        
        for (int L = 0; L < Rozmiar; L++) 
            
            
            {
            
            tab3[L] = tab1[L] + tab2[L];
            
      }
        
        
        return tab3;
        
        
        }

    public static void main(String[] args)
    
 {
        
        
        System.out.println("Wynik zadania" + Arrays.toString(Zadanie3()));
        
        
 }
    
    

}
