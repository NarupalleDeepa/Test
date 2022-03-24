package java_pgms;

public class Demo4 implements i1 {
	public void sum(int x,int y) {
		System.out.println("sum is :" +(x+y));
	}
	
	public void mul(double a,double b) {
		System.out.println("mul is : "+(a*b));

	}
	public static void main(String[] args) {
		i1 obj=new Demo4();
		obj.sum(2,5);
		obj.mul(2.9,2.5);
	}


}
