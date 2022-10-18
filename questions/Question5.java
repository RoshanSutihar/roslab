package question5;

import java.util.Scanner;

public class Question5{

public static void main(String[] args) throws Exception{

        String filename = "students-grades.txt";
        java.io.File file = new java.io.File(filename);
        Scanner input = new Scanner(file);
       System.out.print(filename);
        Scanner scan  = new Scanner(System.in);
        
        // variable declaration
        
        int curGrade; // used for current grade
        int assign=1; // used for assigning the key of marks array
        int total = 0; // total no of items in the list
        String curStudent; // to store the name of current student
        int dummy;  //to get the key to search for the names in another arroay
        String name; // to get the name in the array from dummy index
        int meet = 0; // no of people meeting the criteria
        int actual; // no no people who didnt meet the threshold
        
        
        System.out.print("Enter a minimum grade out of 100: ");
        int threshold = scan.nextInt();
        
        String [] marks = new String [101]; //  creating a array of 100
        int[] place = new int[101];
        
        while (input.hasNext())    // Read the whole file
        {
            
        curStudent = input.next();   // Grab a string
        curGrade = input.nextInt();  // grab next integer
        
        if (curGrade>=threshold){
        
            marks[curGrade] = curStudent;
            place[assign]= curGrade;
            assign++;
            meet ++;
            
        } // if condition close
        
        total++;
        
        } // while close
        input.close();

        System.out.println("The following "+ meet + " students had grade of "+threshold+" or higher.");
        
        for(int marksoutput = 1; marksoutput < assign; marksoutput++){
        
        dummy = place[marksoutput];
        name = marks[dummy];
        
        System.out.print(name + " "+ "("+dummy+")");
        
        if((marksoutput+1)!=(assign)){
        System.out.print(", ");
        
        }else{   
        System.out.print(". ");
        } // else close
        
        } // for j close
        System.out.println();
        actual = total - meet;
        System.out.println("Thre were "+actual+" students below "+ threshold+", for a total of "+total+" students.");
        
        
}


}

