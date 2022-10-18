
package patternpractice;
import java.util.Scanner;
public class Patternpractice {

    public static void main(String[] args) {
       
        
        for(int i =1; i<=5; i++){
            for (int col = 1; col<=i; col++){
            
            System.out.print("x ");
            }
            
            System.out.println();
        }
        
         for ( int row = 1; row <=5; row++){
    
            for (int col = row; col<=5; col++){
            System.out.print("x ");
            }
            System.out.println();
            } 
        System.out.println();
         
//         ==============================================================

         for (int row1 = 1; row1 <=5; row1++){
         
         for (int rowb = row1; rowb<=5; rowb++){
         
             System.out.print("  ");
             
         }
         for (int col1 = 1; col1<=row1; col1++){
         
         System.out.print(" x");
         
         }
         
        
         
         System.out.println();
         }
        System.out.print("");
         //    =================================================================
    
    
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
      
      
      System.out.print("Enter amount: ");
      double inpAmnt = scan.nextDouble();
      
      double realAmnt = inpAmnt*100;
      
      
      
      
    
    
    
    
    
    
        
        
    } // void end
   
} // Class end
