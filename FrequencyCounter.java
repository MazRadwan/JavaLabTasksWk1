import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[10];  

        int numbersEntered = 0;
        while (numbersEntered < 100) {
            System.out.print("Enter a number between 0 and 9: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 9) {
                    count[number]++;  
                    numbersEntered++;  
                } else {
                    System.out.println("Invalid input. Number must be between 0 and 9.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();  
            }
        }
    System.out.println("\nNumber\tFrequency");
    for (int i = 0; i < count.length; i++) {
    System.out.printf("%d \t %d\n", i, count[i]);
    }
    scanner.close();
    }
}   


