/*
 * Author: Ahmed A.
 * Last edit: 29/10/2018
 * This program povides the sum of 20 numbers that a user inputs
 */



package u2_a3_arrays1;

//Imports a text scanner in console
import java.util.Scanner;

public class U2_A3_Arrays1 {
   
    public static void main(String[] args) {
        
        //Initializes the text scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Declare an array for 20 integers
        int [ ] numbers = new int [20];
        //Declare and initialize an integer variable for the total
        int total = 0;
        
        //Prompts user for 20 numbers to be added
        System.out.println("Enter twenty integers and they will be added together:");
        
        //Runs a "for loop" to extract 20 numbers from the user
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //Calculates the total of the 20 numbers the user input in the previous step
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        //Displays the sum of the 20 numbers provided by the user
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
