package java_pgms;

public class Overri1 extends Overri {
	public void sum(double a,double b) {
		System.out.println("sub of value is : "+(a-b));
		super.sum(2, 5);

		
	}
	public static void main(String[] args) {
		Overri obj;
		obj=new Overri1();
		obj.sum(10, 5);
		
	}

	

}
