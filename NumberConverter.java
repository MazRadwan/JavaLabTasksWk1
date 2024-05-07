//Maz Radwan
import java.util.Scanner;

public class NumberConverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning){
            System.out.println("\nMenu:");
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Conver Binary to Decimal");
            System.out.println("3.Exit");
            System.out.println("Enter your choice (1-3): ");

            String input = scanner.nextLine();
            int choice = 0;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1,2, or 3.");
                continue;
            }
            double decimalNumber;
            String binaryNumber;

            switch (choice){
                case 1:
                    System.out.print("Enter a decimal number: ");
                    try {
                        decimalNumber = Double.parseDouble(scanner.nextLine());
                        binaryNumber = Integer.toBinaryString((int) decimalNumber);
                        System.out.println("Output: " + binaryNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid decimal number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    binaryNumber = scanner.nextLine();
                    if (binaryNumber.matches("[01]+")){
                        decimalNumber = Integer.parseInt(binaryNumber, 2);
                        System.out.println("Output: " + (int) decimalNumber);
                    } else {
                        System.out.println("Invalid binary number.");
                    }
                    break;
                case 3: 
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");

        }
    }
    scanner.close();
    System.out.println("Program exited.");
}
}