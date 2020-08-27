import java.util.Scanner;
 
public class MultiplyOutput {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input #1: ");
  int digit1 = in.nextInt();
   
  System.out.print("Input #2: ");
  int digit2 = in.nextInt();
   
  System.out.println(digit1 + " x " + digit2 + " = " + digit1 * digit2);
 }
 
}
