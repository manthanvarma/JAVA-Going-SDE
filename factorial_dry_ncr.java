import java.util.Scanner;

public class factorial_dry_ncr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n-r);

        int ncrfact = nfact/(rfact*nmrfact);
        int nprfact = nfact/nmrfact;
        System.out.println(ncrfact);
        System.out.println(nprfact);
    }

    private static int fact(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
