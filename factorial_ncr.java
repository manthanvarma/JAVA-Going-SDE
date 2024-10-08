import java.util.Scanner;

public class factorial_ncr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n");
        int n = scn.nextInt();
        System.out.println("enter r");
        int r = scn.nextInt();

        int ans1 = 1, ans2 = 1, ans3 = 1;

        for(int i = 1; i <= n; i++) {
            ans1 = ans1 * i;
        }

        for(int i = 1; i <= r; i++) {
            ans2 = ans2 * i;
        }

        for(int i = 1; i <= n-r; i++) {
            ans3 = ans3 * i;
        }

        int ans = ans1/(ans2 * ans3);
        System.out.println(ans);

    }
}
