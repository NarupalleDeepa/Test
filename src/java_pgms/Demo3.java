package java_pgms;

public class Demo3 extends Demo2 {

	
	public void sum(int x, int y) { // changing the logic
		System.out.println("substraction is: " + (x - y));
		super.sum(2, 3);
        
	}

	public static void main(String[] args) {

		Demo2 obj;
		obj= new Demo3();
		
		obj.sum(3, 2);
	}

}