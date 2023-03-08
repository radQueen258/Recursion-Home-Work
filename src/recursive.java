import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner radka = new Scanner(System.in);
        int n ;

        System.out.println("-----------------EXERCISE 1------------------");
        System.out.print("Input number: ");
        n = radka.nextInt();
        System.out.println(Square(n));

    }
    //------------EXERCISE 1--------------
    public static int Square (int n) {
      if (n == 0) return 0;
      return n * n;
    }
}
