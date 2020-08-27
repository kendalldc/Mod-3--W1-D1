import java.util.Scanner;
 
public class Product {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input #1: ");
  int num1 = in.nextInt();
   
  System.out.print("Input #2: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
 }
 
}
