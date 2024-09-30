import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
      
      int reversed = 0;
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();  

      for(;num != 0; num /= 10) {
        reversed = reversed * 10 + num % 10;
      }
  
      System.out.println("Reversed Number: " + reversed);
    }
  }