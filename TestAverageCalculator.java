import java.util.Scanner;


public class TestAverageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0.0;

        while (true){
            System.out.println();
            System.out.print("Enter a number or -999 to stop: ");
            String input = scanner.nextLine();

            int number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.Please input a valid number.");
                continue;
            }

            if (number == -999){
                break;
            }
            sum += number;
            count++;
            }
            if (count > 0){
                average = (double) sum / count;
                System.out.println("The sum of all numbers is: " + sum);
                System.out.println("The average of all numbers is: " + average);
        } else {
            System.out.println("No valid numbers were entered.");
        }
        scanner.close();
    }
    
}
