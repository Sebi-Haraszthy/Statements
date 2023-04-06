import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        isWaterBoiling();                       //1
        isHighestNumber();                      //2
        isEvenOrOdd();                          //3
        isDivisible();                          //4
        isEqual();                              //5
        isLeapYear();                           //6
        isSmallestNumber1();                    //7
        isSmallestNumber2();                    //8
        isWeekday();                            //9
        isSumOfConsecutiveNumbers();            //10
        getMonth(3);                         //11
        showFirstHalfString();                  //12
        isPasswordValid();                      //13
    }

    //1. Check if the water is boiling
    static void isWaterBoiling() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a temperature value: ");
        int temperature = console.nextInt();

        if (temperature > 100) {
            System.out.println("Water is boiling!");
        } else if (temperature > 80 && temperature < 100) {
            System.out.println("Water is almost boiling...");
        } else if (temperature > 0 && temperature < 80) {
            System.out.println("Water is not boiling yet.");
        } else {
            System.out.println("No water!");
        }
    }

    //2. Display the highest number
    static void isHighestNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = console.nextDouble();
        System.out.print("Enter second number: ");
        double b = console.nextDouble();

        if (a > b) {
            System.out.println("Highest number is: " + a);
        } else {
            System.out.println("Highest number is: " + b);
        }
    }

    //3. Display if number is even or odd
    static void isEvenOrOdd() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number to verify: ");
        int a = console.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    //4. Divisibility with 3 and 5
    static void isDivisible() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number to check it's divisibility: ");
        int a = console.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0)) {
            System.out.println("Number is divisible with 3 and 5");
        } else if (a % 3 == 0) {
            System.out.println("Number is divisible with 3");
        } else if (a % 5 == 0) {
            System.out.println("Number is divisible with 5");
        } else {
            System.out.println("Number is NOT divisible with 3 or 5!");
        }
    }

    //5. Equality between numbers
    static void isEqual() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = console.nextInt();
        System.out.print("Enter second number: ");
        int b = console.nextInt();
        System.out.print("Enter third number: ");
        int c = console.nextInt();

        if ((a == b) && (a == c)) {
            System.out.println("All numbers are even");
        } else if ((a == b) || (a == c)) {
            System.out.println("At least 2 numbers are even");
        } else {
            System.out.println("All numbers are different");
        }
    }

    //6. Check if year is leap or not
    static void isLeapYear() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = console.nextInt();

        if (((year % 400 == 0) || (year % 4 == 0)) && (year & 100) != 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    //7. Smallest number with logical operators
    static void isSmallestNumber1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = console.nextInt();
        System.out.print("Enter second number: ");
        int b = console.nextInt();
        System.out.print("Enter third number: ");
        int c = console.nextInt();

        if ((a < b) && (a < c)) {
            System.out.println("Smallest number is: " + a);
        } else if (b < c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
    }

    //8. Smallest number with if/else
    static void isSmallestNumber2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = console.nextDouble();
        System.out.print("Enter second number: ");
        double b = console.nextDouble();
        System.out.print("Enter third number: ");
        double c = console.nextDouble();

        if (a < b) {
            if (a < c) {
                System.out.println("Smallest number is: " + a);
            } else {
                System.out.println("Smallest number is: " + c);
            }
        } else {
            if (b < c) {
                System.out.println("Smallest number is: " + b);
            } else {
                System.out.println("Smallest number is: " + c);
            }
        }
    }

    //9. Weekdays
    static void isWeekday() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        int day = console.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Enter a number between 1-7");
        }
    }

    //10. Display the sum of 2 consecutive numbers in the range 'X->Y', and (Y-X) must have an odd number of elements
    static void isSumOfConsecutiveNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number to count every 2 consecutive numbers: ");
        int x = console.nextInt();
        System.out.print("Enter last number for array to have an odd number: ");
        int y = console.nextInt();
        int sum;

        if ((y - x) % 2 == 0) {
            System.out.println("Error!");
        } else {
            while (x <= y) {
                sum = x + (x + 1);
                System.out.print(sum + " ");
                x += 2;
            }
        }

        System.out.println();
    }

    //11. Method that converts a value (1-12) in the name of its month
    public static String getMonth(int x) {
        if (x == 1) {
            return "January";
        } else if (x == 2) {
            return "February";
        } else if (x == 3) {
            return "March";
        } else if (x == 4) {
            return "April";
        } else if (x == 5) {
            return "May";
        } else if (x == 6) {
            return "June";
        } else if (x == 7) {
            return "July";
        } else if (x == 8) {
            return "August";
        } else if (x == 9) {
            return "September";
        } else if (x == 10) {
            return "October";
        } else if (x == 11) {
            return "November";
        } else if (x == 12) {
            return "December";
        }
        return null;
    }

    //12. Extract the first half of a String where the String's length is even
    static void showFirstHalfString() {
        Scanner console = new Scanner(System.in);
        System.out.print("Original string: ");
        String string = console.nextLine();

        if (string.length() % 2 == 0) {
            System.out.println(string.substring(0, string.length() / 2));
        } else {
            System.out.println("String's length is an odd number!");
        }
    }

    //13. Write a method to check if a password is correct.
    // The rules for a password to be correct are:
    // - the password must be at least 10 characters long
    // - the password must have only letters or numbers
    // - the password must contain at least two digits
    // If the password entered is invalid, it displays a message and allows the user to enter another password,
    // until a valid password is entered.
    static boolean isPasswordValid() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = console.nextLine();
        int countDigits = 0;

        if (password.length() < 10) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i)))) {
                return false;
            }
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}