import java.util.Scanner;
class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number1 = scanner.nextInt();

        System.out.println("Give another number:");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " / " + number2 + " = " + quotient);
    }
}