package java_pgms;

public class Demo5 implements i3  {
	public void sum(int a,int b) {
		System.out.println("sum is :" +(a+b));
	}
	
	public void mul(double x,double y) {
		System.out.println("mul is : "+(x*y));

	}
	public static void main(String[] args) {
		i3 obj=new Demo5();
		obj.sum(2,5);
		obj.mul(5,7);
	}


}


