public class factors_sqrt {  
    public static void main(String[] args) {
        int n = 36;
        int sqrt_n = (int) Math.sqrt(n); 
        for(int i = 1; i <= sqrt_n; i++) { 
            if(n % i == 0) {
                System.out.println(i + " "); 
                if(i != n / i) { 
                    System.out.println(n / i);
                }
            }
        }
    }
}
