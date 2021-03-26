class Simple {
	public static void main(String args[]) {
		System.out.println("Hello Java");
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
		
		float f = a; //Widening
		System.out.println(a);
		System.out.println(f);
		
		// Narrowing (Typecasting)
		int d = (int)f;	
		System.out.println(d);
		
		// Overflow
		a = 130;
		byte by = (byte)a;
		System.out.println(a);
		System.out.println(by);
		
		// adding lower type
		byte aa = 10;
		byte bb = 10;
		
		//byte c = a + b; // Compile Time Error: because a + b = 20 will be int
		byte cc = (byte)(a + b);
		System.out.println(c);
	}
}
