package question2;

import java.util.Scanner;

public class Question2{

    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    
    int rand1 = ((int) (Math.random()*100) +1); // random number generating
    int rand2 = ((int)(Math.random()*100) + 1);
    
    int highest = 0, lowest = 0; // assigning the values
    
    if(rand1>rand2){ // differentiating big and  small random numbers 
    highest= rand1;
    lowest = rand2;
    } else if(rand2 >rand1){
     highest = rand2;
    lowest = rand1;
    } // elseif close
    
    
    System.out.println("Two random numbers have been generated!");
    
    double midpoint = (rand1+rand2)/2; //getting the midpoint
    int midvalue = (int)midpoint;
    
    
    int inp1 = 0;
    int inp2;
    while(inp1 != midvalue){
        
        System.out.print("Enter a guess: ");
        inp2 = scan.nextInt();
        inp1 = inp2;
    
    
        if(inp1 == midvalue){
            System.out.println(inp1+ " is within 1 of the midpoint, which is "+ midpoint);   
        } else if(inp1 > highest){  
         System.out.println(inp1+" is above two values ");
        } else if(inp1<lowest){
        System.out.println(inp1+" in below two numbers");
        } else if(inp1 >lowest && inp1<highest){
            System.out.println(inp1+" is between two numbers.");
        } else if( inp1== lowest || inp1 == highest){
         System.out.println(inp1+" is equal to one of the numbers.");
        }// elseif close
    
    } // while loop close
 
  } // main close

} // class close