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
}
