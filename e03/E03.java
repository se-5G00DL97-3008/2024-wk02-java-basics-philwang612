import java.util.Scanner;
class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Evaluating the number and printing the result
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero");
        }
    }
}