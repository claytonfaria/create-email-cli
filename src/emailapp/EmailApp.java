package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void createMail() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter new employee's first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter new employee's last name: ");
        String lastName = scan.nextLine();
        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());

    }
    public static void main(String[] args) {
        createMail();

    }
}
