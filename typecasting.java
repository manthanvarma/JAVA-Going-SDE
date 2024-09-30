public class typecasting {
    public static void main(String[] args) {
        float a = 3.4f;
        double b = a;
        System.out.println(b);

        double c = 6.6;
        float d = (float)c;   // forceful conversion
        System.out.println(d);
    }
}
