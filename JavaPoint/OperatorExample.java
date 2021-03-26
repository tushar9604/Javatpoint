class OperatorExample {
	
	public static void main(String args[]) {
		int x = 10;
		System.out.println(x++); // 10(11)
		System.out.println(++x); //12
		System.out.println(x--); //12(11)
		System.out.println(--x); //10
		
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a); //10 + 12 = 22
		System.out.println(b++ + b++); //10 + 11 = 21
		
		a = 10;
		b = -10;
		boolean c = true;
		boolean d = false;
		
		System.out.println(~a); //-11 (minus of total positive value which starts from 0)
		System.out.println(~b); //9 (positive of total minus, positive starts from 0)
		System.out.println(!c); // false (opposite of boolean value)
		System.out.println(!d); // true
		
		a = 10;
		b = 5;
		
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a*b);//50
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		System.out.println(10*10/5+3-1*4/2);
		
		System.out.println(10<<2); //10*2^2 = 10 * 4 = 40
		System.out.println(10<<3); //10*2^3 = 10 * 8 = 80
		System.out.println(20<<2); //20*2^2 = 20 * 4 = 80
		System.out.println(15<<4);		//15*2^4 = 15 * 16 = 240
		
		System.out.println(10>>2); // 10/2^2 = 10/4 = 2
		System.out.println(20>>2); // 20/2^2 = 20/4 = 5
		System.out.println(20>>3); // 20/2^3 = 20/8 = 2
		
		// For positive number, >> and >>> works same
		System.out.println(20>>2);
		System.out.println(20>>>2);
		
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
			
		a = 10;
		b = 5;
		int cc = 20;
		
		System.out.println(a<b && a<cc); // fales && true = false
		System.out.println(a<b && a<cc); // false & true = false
		
		System.out.println(a<b&&a++<cc); // false && true = false
		System.out.println(a); // 10 because second condition is not checked
		System.out.println(a<b&a++<cc); //false & true = false
		System.out.println(a); // 11 because second condition is checked
		
		a = 10;
		b = 5;
		cc = 20;
		
		System.out.println(a>b||a<cc); // true || true = true
		System.out.println(a>b | a<cc); // true | true = true
		
		System.out.println(a>b || a++<cc); // true || true = true
		System.out.println(a); // 10 because second condition is not checked
		System.out.println(a>b | a++<cc); // true | true = true
		System.out.println(a); // 11 because second condition is checked
		
		a = 2;
		b = 5;
		
		int min = (a<b)?a:b;
		System.out.println(min);
		
		a = 10;
		
		a += 3; // 10 + 3
		System.out.println(a);
		
		a -= 4; // 13 - 4
		System.out.println(a);
		
		a *= 2; // 9*2
		System.out.println(a);
		
		a /= 2; // 18 / 2
		System.out.println(a);
		
		short aa = 10;
		short bb = 10;
		
		// aa = aa + bb; // Compile time 	error because 10 + 10 = 20 now int
		aa = (short)(aa+bb); // 20 which is now converted to short
		System.out.println(aa);
	}
}