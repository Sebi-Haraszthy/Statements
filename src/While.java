import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        displayNumbers();                  //1
        sumOfNumbers();                 //2
        displayEvenNumbers();              //3
        sumOfDivisibility();            //4
        reversedNumber();                   //5
        displayFactorial();               //6
        countDigits();                     //7
        isDivisible();                  //8
        guessNumber();                  //9
        displayFibonacci();                //10
        displayAverage();                  //11
        displayBasePower();                //12
        checkPassword();                //13
    }

    //1. Display numbers in a specified interval
    static void displayNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval: ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval: ");
        int b = console.nextInt();
        System.out.print("Numbers in the interval are: ");

        while (a <= b) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println();
    }

    //2. Display sum of numbers in a specified interval
    static void sumOfNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval: ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval: ");
        int b = console.nextInt();
        int sum = 0;

        while (a <= b) {
            sum = sum + a;
            a++;
        }

        System.out.println();
        System.out.println("Sum of numbers in interval is: " + sum);
    }

    //3. Display even numbers in a specified interval
    static void displayEvenNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval: ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval: ");
        int b = console.nextInt();
        System.out.print("Even numbers in interval are: ");

        while (a <= b) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println();
    }

    //4. Display sum of numbers divisible with 3 in a specified interval
    static void sumOfDivisibility() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval: ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval: ");
        int b = console.nextInt();
        int sum = 0;

        while (a <= b) {
            if (a % 3 == 0) {
                sum += a;
            }
            a++;
        }

        System.out.println("Sum of numbers divisible with 3 is: " + sum);
    }

    //5. Reverse the digits of a number
    static void reversedNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = console.nextInt();
        int reversedNumber = 0;
        int lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        System.out.println("Reversed number is: " + reversedNumber);
    }

    //6. Display factorial
    static void displayFactorial() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of factorial: ");
        int a = console.nextInt();
        int i = 1;
        int product = 1;

        while (i <= a) {
            product = product * i;
            i++;
        }

        System.out.println("Result for factorial is: " + product);
    }

    //7. Sum of the digits of a number
    static void countDigits() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number to count the sum of it's digits: ");
        int number = console.nextInt();
        int sum = 0;
        int lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        System.out.println("Sum of digits of the number is: " + sum);
    }

    //8. The sum of numbers divisible by 3 and the sum of numbers divisible by 7 in a specified interval
    static void isDivisible() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval: ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval: ");
        int b = console.nextInt();
        int sum3 = 0;
        int sum7 = 0;

        while (a <= b) {
            if (a % 3 == 0) {
                sum3 += a;
            }
            if (a % 7 == 0) {
                sum7 += a;
            }
            a++;
        }

        System.out.println("Sum of divisibility with 3 is: " + sum3);
        System.out.println("Sum of divisibility with 7 is: " + sum7);
    }

    //9. Guessing game
    static void guessNumber() {
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number to guess: ");
        int n = console.nextInt();
        int x = 1;

        while (n != answer) {
            if (n < answer) {
                System.out.println("The number is too small");
            } else {
                System.out.println("The number is too high");
            }

            x = x + 1;
            n = console.nextInt();
        }

        System.out.println("You guessed, it took you " + x + " tries");
    }

    //10. Display the first 'n' numbers in the Fibonacci sequence
    static void displayFibonacci() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci sequence: ");
        int number = console.nextInt();
        System.out.print("The Fibonacci sequence is: ");
        int n1 = 0;
        int n2 = 1;
        int i = 1;
        int sum;

        while (i <= number) {
            System.out.print(n1 + " ");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            i++;
        }

        System.out.println();
    }

    //11. Enter numbers until 0 is entered, then display the average of the numbers entered
    static void displayAverage() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter numbers to calculate their average: ");
        int n = console.nextInt();
        int count = 0;
        int sum = 0;
        int average;

        while (n != 0) {
            count++;
            sum = sum + n;

            System.out.print("Enter a new number: ");

            n = console.nextInt();
        }

        average = sum / count;

        System.out.println("Average of entered numbers is: " + average);
    }

    //12. Display 'base' at power of 'exponent'
    static void displayBasePower() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base = console.nextInt();
        System.out.print("Enter an exponent number: ");
        int exponent = console.nextInt();
        int result = 1;

        while (exponent != 0) {
            result *= base;
            exponent--;
        }

        System.out.println("Result is: " + result);
    }

    //13. Write a method that reads the user's password from the keyboard, up to 3 times.
    // The entered password is verified with an existing password (a string variable is declared that retains the existing password, correct)
    // and display a corresponding message:
    //a. “Account blocked”, if you enter the wrong password 3 times
    //b. "You are logged in", if you enter the correct password from a maximum of 3 attempts
    public static void checkPassword() {
        String existingPassword = "ABC";
        boolean isCorrectPassword = false;
        int i = 1;

        while ((i <= 3) && (!isCorrectPassword)) {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter password: ");
            String providedPassword = console.nextLine();
            if (existingPassword.equals(providedPassword)) {
                System.out.println("You are logged in!");
                isCorrectPassword = true;
            }
            i++;
        }
        if (!isCorrectPassword) {
            System.out.println("Account blocked!");
        }
    }
}