import java.util.Scanner;
class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the day
        System.out.println("Enter a day:");
        int day = scanner.nextInt();

        // Asking for the month
        System.out.println("Enter a month:");
        int month = scanner.nextInt();

        // Checking if it's Christmas
        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas");
        }
    }
}