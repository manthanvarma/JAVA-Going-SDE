import java.util.Scanner;
public class factorial_dry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int n1 = fact(n);
        System.out.println(n1);
    }

    private static int fact(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
