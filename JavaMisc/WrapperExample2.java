//Java program to convert object into primitives
// Unboxing example of Integer to into
public class WrapperExample2{
	public static void main(String[] args){
		// Converting Integer to into
		Integer a = new Integer(3);
		int i = a.intValue(); // converting Integer to int explicitly
		int j = a; // unboxing, now complier will write a.intValue() internally
		
		System.out.println(a+" "+i+" "+j);
	}
}