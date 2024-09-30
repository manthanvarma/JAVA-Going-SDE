import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if(age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        
    }
}
