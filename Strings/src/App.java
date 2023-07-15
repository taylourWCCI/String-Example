import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String Declaration
        String myGreeting = "Wassup";
        System.out.println(myGreeting);

        // Concatenation
        int numberOfSuits = 4;
        System.out.println("I have " + numberOfSuits + " suits.");

        // Comparison
        int numberOfMaids = 7;
        int numberOfMops = 7;
        if (numberOfMaids == numberOfMops) {
            System.out.println("They can work.");
        } else {
            System.out.println("They are kicked out.");
        }

        // Case Conversion
        System.out.println(myGreeting.toUpperCase());
        System.out.println(myGreeting.toLowerCase());

        // Length
        String palindrome = "Race Car";
        int palindromeLength = palindrome.length();
        System.out.println(palindrome + " has " + palindromeLength + " characters.");

        // Special Characters
        System.out.println("I said \"Get Up\"");
        System.out.println("This is the first line.\nSecond line");
        System.out.println("\tWhat does it do?");

        // Scanner class for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color, Please.");
        String colorResponse = input.nextLine();
        if(colorResponse.toLowerCase().equals("orange")) {
            System.out.println("Then you get 500 dollars.");
        } else {
            System.out.println("You lose 1000 dollars.");
        }
        input.close();
    }
}
