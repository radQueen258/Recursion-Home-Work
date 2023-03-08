import java.util.Arrays;
import java.util.Scanner;

public class recursive {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner radka = new Scanner(System.in);
        int n, number = 0;


        System.out.println("-----------------EXERCISE 1------------------");
        System.out.print("Input number: ");
        n = radka.nextInt();
        System.out.println(Square(n));

        System.out.println();
        System.out.println("-----------------EXERCISE 2------------------");
        reverseSequence(radka);

        System.out.println();
        System.out.println("-----------------EXERCISE 3------------------");
        System.out.println(x(n));

        System.out.println();
        System.out.println("-----------------EXERCISE 4------------------");
        System.out.println("Enter a number: ");
        number = radka.nextInt();
        System.out.println("------NUMBER OF DIGITS------");
        System.out.println(countDigits(number));
        System.out.println("------SUM OF DIGITS------");
        System.out.println(sumDigits(number));

        System.out.println();
        System.out.println("-----------------EXERCISE 5------------------");
        System.out.println("--------SUM WITH ONE--------");
        System.out.println(sumWithOne(n));
        System.out.println("-------MULTIPLICATION WITH ONE-----");
        System.out.println(multiplicationWithOne(n));

        System.out.println();
        System.out.println("-----------------EXERCISE 6------------------");
        System.out.println("---------BINARY REP OF " + n + "--------");
        System.out.println(integerToBinary(n));

        System.out.println();
        System.out.println("-----------------EXERCISE 7------------------");

        System.out.println();
        System.out.println("-----------------EXERCISE 8------------------");
        int array[] = new int[5];
        System.out.println("Array elements: ");
        for (int i = 0; i < array.length; i ++) {
            array[i] = radka.nextInt();
        }
        System.out.println("The sum of the array " + Arrays.toString(array) );
        System.out.println(sumArray(array, array.length));

        System.out.println();
        System.out.println("-----------------EXERCISE 9------------------");
        System.out.println("Is there any positive number in the array");
        System.out.println(checkPositive(array));
        System.out.println("Is there any negative number in the array");
        System.out.println(checkNegative(array));


    }
    //------------EXERCISE 1--------------
    public static int Square (int n) {
      if (n == 0) return 0;
      return n * n;
    }
    //----------EXERCISE 2--------------
    public static void reverseSequence(Scanner radka) {
        //Enter number
        System.out.println("Next number = ");
        int x = radka.nextInt();
        //Prove by 0
        if (x == 0) return;
        //Recursion
        reverseSequence(radka);
        //Take out number
        System.out.println(x);
    }
    //----------EXERCISE 3--------------
    public static double x (int n) {
        if (n == 0) return 0;
        return Math.sqrt(2.0 + x (n - 1));
    }
    //----------EXERCISE 4--------------
    public static int countDigits (int number) {
        if ( number > 0) {
            counter ++;
            countDigits(number / 10);
        }
        return counter;
    }
    public static int sumDigits (int number) {
        if (number == 0) return 0;
        return (number % 10 + sumDigits(number / 10));
    }
    //----------EXERCISE 5--------------
    public static int sumWithOne (int n) {
        if (n == 0) return 0;
        return n + sumWithOne(n - 1);
    }
    public static int multiplicationWithOne (int n) {
        if (n == 0) return 0;
        return 5 + multiplicationWithOne(n-1);
    }
    //----------EXERCISE 6--------------
    public static int integerToBinary (int n) {
        if (n == 1) return 1;
        return integerToBinary(n / 2) * 10 + n % 2;
    }
    //----------EXERCISE 7--------------

    //----------EXERCISE 8--------------
    public static int sumArray (int arr[], int m) {
        if (m <= 0) return 0;
        return (sumArray(arr, m - 1) + arr[m-1]);
    }
    //----------EXERCISE 9--------------
    public static boolean checkPositive (int arr[]) {
        for (int i = 0; i <= arr.length; i ++) {
            if (arr[i] > 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkNegative (int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < 0) {
                return true;
            }
        }
        return false;
    }
}
