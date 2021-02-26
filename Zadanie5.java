
package zadanie.pkg5;


public class Zadanie5 
{

    public static int Zadanie6(int u, int l) 
    
    {
        
while (u != l) 
        
        {
            
            
   if (u > l)
       
       
            {
                
                
                u -= l;
                
                
            }
            
      else 
            
            {
                
                l -= u;
                
                
            }
            
        }
        return u;
    }

    public static void main(String[] args)
            
            
    {
        
        
        System.out.println(" Wynik i koniec zadania " + Zadanie6(12, 14));
        
        
    }
    
}