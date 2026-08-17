import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a membership card? (true/false): ");
        String isMember = scanner.next();

        int price;

        if (age < 12) {
            price = 5;
        } else if (age >= 65) {
            price = 7;
        } else {
            price = 10;
        }

        if (isMember) {
            price = price - 2;
        }

        System.out.println("Final Ticket Price: $" + price);

        scanner.close();
    }
}