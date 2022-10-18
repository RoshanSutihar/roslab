package question3;

import java.util.Scanner;
public class Question3{

    public static void main(String[] args){
    char operator;
    int row; 
    int rowinp;
    int column;  
    int Calc;
        
    Scanner scan  = new Scanner(System.in);
    
    System.out.print("Please enter an integer for the class of the table: ");
    
    rowinp = scan.nextInt();
    System.out.print("Please enter a legal operator from *, /, +, -: ");
    operator = scan.next().charAt(0);
    
    switch(operator){
        
    
        case '+': for(int col1= 1; col1<=rowinp; col1++){   
                    System.out.print("\t" +col1);     
                }
                System.out.println("");
                System.out.println("-------------------------------");
            
                for(int row1= 1; row1<=rowinp; row1++){
  
                System.out.print( row1);
          
                for(column = 1; column<=rowinp; column++){

                Calc = row1 + column;
                System.out.print("\t"+Calc);
                }

                System.out.println();};
                break;
        
        case '-': for(int col1= 1; col1<=rowinp; col1++){   
                    System.out.print("\t" +col1);     
                }
                System.out.println("");
                System.out.println("-------------------------------");
            
                for(int row1= 1; row1<=rowinp; row1++){
  
                System.out.print( row1);
          
                for(column = 1; column<=rowinp; column++){

                Calc = row1 - column;
                System.out.print("\t"+Calc);
                }

                System.out.println();};
                break;
                
        case '*': for(int col1= 1; col1<=rowinp; col1++){   
                    System.out.print("\t" +col1);     
                }
                System.out.println("");
                System.out.println("-------------------------------");
            
                for(int row1= 1; row1<=rowinp; row1++){
  
                System.out.print( row1);
          
                for(column = 1; column<=rowinp; column++){

                Calc = row1 * column;
                System.out.print("\t"+Calc);
                }

                System.out.println();};
                break;
                
        case '/': for(int col1= 1; col1<=rowinp; col1++){   
                    System.out.print("\t" +col1);     
                }
                System.out.println("");
                System.out.println("-------------------------------");
            
                for(int row1= 1; row1<=rowinp; row1++){
  
                System.out.print( row1);
          
                for(column = 1; column<=rowinp; column++){

                Calc = row1 / column;
                System.out.print("\t"+Calc);
                }

                System.out.println();};
                break;
        
    
    
    }
    
    }



}

