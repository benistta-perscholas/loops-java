import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1. Print a Multiplication Table. Write a program that uses nested for loops to print a multiplication table.
        int tableSize = 12;
        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%6d", i * j);
            }
            System.out.println();
        }

    //2.Find the Greatest Common Divisor
    //Write a program that prompts the user to enter two positive
    //integers, and find their greatest common divisor (GCD).
    //Examples:
    //Enter 2 and 4. The gcd is 2.
    //Enter 16 and 24. The gcd is 8.
    //How do you find the gcd?
    //Name the two input integers n1 and n2.
    //You know number 1 is a common divisor, but it may not be
    //the gcd.
    //Check whether k (for k = 2, 3, 4, and so on) is a common
    //divisor for n1 and n2, until k is greater than n1 or n2.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second positive integer: ");
        int n2 = scanner.nextInt();
        int gcd = 1;
//        Could I use while loop here? why and why not?
        for (int k = 1; k <= Math.min(n1, n2); k++) {
//            is it a divisor of both?
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        System.out.println("The gcd is " + gcd);
        scanner.close();
//

    //3.Predict Future Tuition
    //Suppose the tuition for a university is $10,000 for the current year
    //and increases by 7 percent every year.
    //In how many years will the tuition be doubled?
        int tuition = 10000;
        int year = 0;
    //In this example, which one is better to use? For or while loop? why?
//        for(year = 0; tuition < 20000; year ++){
//            tuition *= 1.07;
//        }

        while(tuition < 20000) {
            tuition *= 1.07;
            year ++;
        }
        System.out.println("Tuition will double in " + year + " years");
    }
}