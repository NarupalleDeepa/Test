package java_pgms;
import java.util.Scanner;

public class Bill_gen {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter no of pizza's : ");
 int pizza=sc.nextInt();
 System.out.println("Enter no of puff : ");
 int puff=sc.nextInt();
 System.out.println("Enter no of cooldrinks : ");
 int cooldrinks=sc.nextInt();
 
 int p=100*pizza;
 int q=20*puff;
 int r=10*cooldrinks;
 int tp=p+q+r;
 
 System.out.println("Bill_Details");
 System.out.println("No of Pizza's : "+pizza);
 System.out.println("No of puff = "+puff);
 System.out.println("No of cooldrinks : "+cooldrinks);
 System.out.println("total price : "+tp);
 System.out.println("ENJOY THE SHOW!!!");
}
}
