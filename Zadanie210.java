
package zadanie.pkg2.pkg10;
import java.util.Scanner;
import java.util.Arrays;


public class Zadanie210 {

public static int[] get_tab() 
{
        Scanner scan = new Scanner(System.in);
        
        
                int L = 1;
        
        
  System.out.println ( "Jak duża ma byc twoja tablica?" );
        
        int Jak_duża_ma_byc_tablica;
        
        
                Jak_duża_ma_byc_tablica = scan.nextInt();
        
        
    System.out.println( "Wpisz swoja wartość" );
    
                 int liczba;
                 
                 
   liczba = scan.nextInt();
   
           int[] tab = new int[ Jak_duża_ma_byc_tablica ];
           
    tab[0] = liczba;

        while ( L < Jak_duża_ma_byc_tablica )
        
        {
            
            
            for ( int K = 1;K < Jak_duża_ma_byc_tablica*Jak_duża_ma_byc_tablica; K++ ) 
            
            
            {
                
                if (( K > liczba ) && (K > tab [ L-1 ]) && (K % 2 == 0 ))
                
                {
                    
                    
                    tab[L] = K;
                    
                    L++;
                    
                    break;
               }
               }
               }
 
        return tab;
        
   }
                        public static int minimum( int [] tab ) 
                        
                        
                        {
     int minimum = tab[0];
     

    for ( int U: tab ) 
    
    {
         if (U < minimum )
             
            
            {
                    minimum = U;
            }
        }
    
           return minimum;
    }

    public static int maximum( int [] tab )
    
    {
                int maximum = tab [0];
                
        for (int O: tab )
        {
            
    if (O > maximum  )
    {
                maximum = O;
                
               }
        }
         
  return maximum;
  
    }
    
            public static int wynik( int [] tab )
    
    {
        int wynik = 0;
        
        for (int E: tab )
        
        {
            
                 wynik += E;
            
        }
        
        
    return wynik;
    
    
    }
            
            
    public static double średnia( int [] tab)
    
    {
        
     double wynik = 0;
        
        
            for (double W: tab)
        
        {
            
            
        wynik += W;
            
            
        }
        
        
                return wynik / tab.length;
    }
    
    public static int mediana( int [] tab )
    
    {
                Arrays.sort( tab );
        
        
  int mediana = 0;
        
        
        if (tab.length % 2 == 0) 
        
        
        {
            
            
            int F = tab[(tab.length / 2) - 1], G = tab [( tab.length / 2 )];
          
            
         mediana = (F + G) / 2;
           
         
        }
        else
        
        {
                  mediana = tab [( tab.length / 2)];
        }
        
        
   return mediana;
    }

    public static void main (String[] args)
    
    {
        int[] tab = get_tab ();
        
        
      System.out.println("Wynik tablica_" + Arrays.toString(tab));
        
                    System.out.println("Wynik wartość najmniejsza_" + minimum( tab));
        
System.out.println("Wynik wartość największa_" + maximum (tab));

 System.out.println("Wynik suma wartość_" + wynik (tab));
 
 System.out.println("Wynik średnia wartość_" + średnia (tab));
       
            System.out.println("Wynik mediana wartość_" + mediana (tab));
            
    }
}
