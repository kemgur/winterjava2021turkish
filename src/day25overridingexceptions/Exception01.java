package day25overridingexceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println(divide(6,2));
		System.out.println(divide(2,6));
		System.out.println(divide(-8,-4));
		System.out.println(divide(-4,-8));//0,5
		System.out.println(divide(12,-2));//-6.0
		System.out.println(divide(-3,12));//-0.25
		System.out.println(divide(0,2));//0.0
		System.out.println(divide(4,0));//Infinity
		
		System.out.println(divider(4,0));
		
		
	}

	
//	public static double divide(double a, double b) {
//		return a/b;		
//	}
	public static int divide(int a, int b) {
		if(b==0) {
			System.out.println("Do not use zero for denominator");
			return 0;
		}else {
			
		return a/b;	
		}
}
	
	public static int divider(int a, int b) {
		int result =0;
		
		try {
			result =a/b;
		}catch(ArithmeticException e) {
			
			System.out.println("Do not use zero for denominator");
			
		}
		return result;
}
}