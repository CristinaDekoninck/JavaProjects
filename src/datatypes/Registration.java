package datatypes;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please complete all fields to register.");
        System.out.println("What is your first name?");
        String forename = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.println("Would you like to receive our newsletter? (y/n)");
        boolean newsletter;
        if(scanner.nextLine().equalsIgnoreCase("y")) {
            newsletter = true;
        }
        else
            newsletter = false;

        System.out.println("Please check and confirm the details entered are correct:");
        System.out.println("Name: " + forename + " " + surname + ", " + age +" years old.");
        System.out.println("Receiving our newsletter: " + newsletter);
        System.out.println("Are these details correct? (y/n)");
        if(scanner.nextLine().equalsIgnoreCase("y")){
            System.out.println("Thanks for registering, Goodbye!");
        }
        else
            System.out.println("Registration aborted, please start again.");
    }

}