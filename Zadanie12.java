
package zadanie.pkg1.pkg2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie12 {

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wpisz tutaj rozmiar swojej tablicy");
        
        
       int Rozmiar = scanner.nextInt();
        
        double[] tab1 = new double[Rozmiar];
        
        for (int i = 0; i < Rozmiar; i++)
        
        {
            System.out.println("Tutaj wpisz liczbe ["+i+"]");
            
            
            tab1[i] = scanner.nextInt();
        }
        
        for (double x : tab1)
        {   
        
        
        {
            
                    
            System.out.println(x);
            
        }
    } System.out.println("Wypisane liczby koniec");
}
}

        
        
        
        
 
