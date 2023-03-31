import java.util.Scanner;
public class Inputfunctions {
  public static void main(String[] args) {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   int n1, n2, n3;
   n1 = readme.nextint();
   n2 = readme.nextint();
   n3 = n1 + n2;
   System.out.println("Total = " + n3);
  }
}