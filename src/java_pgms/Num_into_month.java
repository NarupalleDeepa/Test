package java_pgms;
import java.util.Scanner;
public class Num_into_month {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the month number = ");
	int monthno=sc.nextInt();
	if(monthno==1)
		System.out.println("Jan");
	else if(monthno==2)
		System.out.println("feb");
	else if(monthno==3)
		System.out.println("mar");
	else if(monthno==4)
		System.out.println("apr");
	else if(monthno==5)
		System.out.println("may");
	else if(monthno==6)
		System.out.println("jun");
	else if(monthno==7)
		System.out.println("jul");
	else if(monthno==8)
		System.out.println("aug");
	else if(monthno==9)
		System.out.println("sep");
	else if(monthno==10)
		System.out.println("oct");
	else if(monthno==11)
		System.out.println("nov");
	else if(monthno==12)
		System.out.println("dec");
	else if(monthno>12)
		System.out.println("No month for the num : "+monthno);
	}}
