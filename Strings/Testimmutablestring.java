class Testimmutablestring{
	public static void main(String[] args){
		String s = "Sachin";
		s.concat("Tendulkar"); // concat() method append the string at the end
		System.out.println(s); // will print Sachin because strings are immutable objects
	}
}
