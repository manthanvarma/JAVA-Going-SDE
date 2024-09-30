
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scn.nextInt();

        System.out.println("enter first number");
        int b = scn.nextInt();

        System.out.println("enter first number");
        int c = scn.nextInt();

        int max;

        if(a>b && a>c) {
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
