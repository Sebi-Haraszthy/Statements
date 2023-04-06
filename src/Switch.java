import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        isWeekday();            //1
        isMonth();              //2
    }

    //1. Display day of the week
    static void isWeekday() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        int day = console.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("NOT A WEEKDAY!");
        }
    }

    //2. Display month of the year
    static void isMonth() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = console.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("NOT A MONTH!");
        }
    }
}