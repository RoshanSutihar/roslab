
package patternpractice;
import java.util.Scanner;
public class Patternpractice {

    public static void main(String[] args) 
   
    
         System.out.println("0        1         2");
         System.out.println("12345678901234567890");
         
         
    int col1;
         
    for(int exr = 1; exr<= 10; exr++){
            
        for(col1 = 1; col1<exr; col1++){
        
        System.out.print(" ");
        
        
        }

        
        System.out.print("x");
        
        for (int col3 = col1; col3<= (19-col1); col1++){
        System.out.print(" ");
        }
        System.out.print("x");
        
        System.out.println();
    }
   
      Scanner scan = new Scanner(System.in);
      
      
     
      
      
      
      
    
    
    
    
    
    
        
        
    } // void end
   
} // Class end
