package javafoundation.part2_loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day (e.g. Monday, Tuesday): ");
        String day = sc.nextLine().trim().toLowerCase();  // make it case-insensitive

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a Weekday.");
                break;

            case "saturday":
            case "sunday":
                System.out.println(day + " is a Weekend.");
                break;

            default:
                System.out.println("Invalid day entered.");
        }

  // enhanced way to write switch
        System.out.print("Enter a number (1 to 7): ");
        int day2 = sc.nextInt();

        switch (day2) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number! Please enter 1 to 7.");
        }


        // NESTED SWITCH
        System.out.println("Select Department:");
        System.out.println("1. Computer Science");
        System.out.println("2. Mechanical");

        int dept = sc.nextInt();

        switch (dept) {
            case 1:
                System.out.println("Computer Science Department");
                System.out.println("Choose course:");
                System.out.println("1. Java");
                System.out.println("2. Python");

                int csCourse = sc.nextInt();
                switch (csCourse) {
                    case 1 -> System.out.println("You selected Java.");
                    case 2 -> System.out.println("You selected Python.");
                    default -> System.out.println("Invalid CS course.");
                }
                break;

            case 2:
                System.out.println("Mechanical Department");
                System.out.println("Choose course:");
                System.out.println("1. Thermodynamics");
                System.out.println("2. Fluid Mechanics");

                int mechCourse = sc.nextInt();
                switch (mechCourse) {
                    case 1 -> System.out.println("You selected Thermodynamics.");
                    case 2 -> System.out.println("You selected Fluid Mechanics.");
                    default -> System.out.println("Invalid Mechanical course.");
                }
                break;

            default:
                System.out.println("Invalid department.");
        }
    }
}
