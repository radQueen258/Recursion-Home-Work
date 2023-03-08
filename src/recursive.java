import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner radka = new Scanner(System.in);
        int n ;

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
}
