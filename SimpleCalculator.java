//Maz Radwan
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println();
        System.out.print("Enter two numbers: ");
        String input = scanner.nextLine();

        //parse input
        double number1 = Double.parseDouble(input.split(" ")[0]);
        double number2 = Double.parseDouble(input.split(" ")[1]);

    // Prompt user for operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.nextLine();

    //calculations based on operrator using switch statement
        double result;
        switch (operator){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0){
                    System.out.println("Cannot divide by zero");
                    scanner.close();
                    return;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
    }   
    System.out.printf("%.2f %s %.2f = %.2f\n", number1, operator, number2, result);
    scanner.close();
    }
}

