package MethodOverLoadingEx;

public class MethodOverLoadingEx1 {
	int a=10,b=20;
	void sum() {
		System.out.println("sum:  "+(a+b));
	}
	void sum(int a,int b) {
		System.out.println("sum:  "+(a+b));
	}
	void sum(double a,double b) {
		System.out.println("sum:  "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverLoadingEx1 ob=new MethodOverLoadingEx1();
		ob.sum();
		ob.sum(12,13);
		ob.sum(12.6,3.45);
	}

}
