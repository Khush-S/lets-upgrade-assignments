import java.util.*;
public class interger{
    public static void main(String[] args) {
    System.out.println("enter a number");
    Scanner Scan=new Scanner(System.in);
    Double a=Scan.nextDouble();
    if(a>0){
        System.out.println("the number is positive");
    }
    else if(a<0){
        System.out.println("the number is negative");
    }
    else if(a==0){
        System.out.println("the number is zero");
    }
    return;
    }
}