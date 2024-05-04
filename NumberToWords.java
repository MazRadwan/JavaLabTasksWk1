
import java.util.Scanner;


public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a one-digit number (0-9): ");
        int num = scanner.nextInt();
    if (num < 0 || num > 9) {
        System.out.println("Invalid input"); 
    } else {
        String word = getWord(num);
        System.out.println(word);
    }
    scanner.close();
}
private static String getWord(int num){
    switch (num){
        case 0: return "Zero";
        case 1: return "One";
        case 2: return "Two";
        case 3: return "Three";
        case 4: return "Four";
        case 5: return "Five";
        case 6: return "Six";
        case 7: return "Seven";
        case 8: return "Eight";
        case 9: return "Nine";
        default: return "";
    }
}
}