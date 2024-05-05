 // Maz Radwan 
import java.util.Scanner;

public class LargestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // create an array of 5 integers

        System.out.println();
        System.out.println("Please enter five intergers: "); 

        // loop to get 5 integers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": "); 
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer."); 
                scanner.next();
                System.out.print("Enter integer" + (i + 1) + ": "); //  keep promting user until you get 5 inputs
            }
            numbers[i] = scanner.nextInt();
        }
        scanner.close(); 
        
        // calcutions to find the largest integer
        int max = numbers[0];
        for ( int num : numbers){
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest number is: " + max);
    }
}