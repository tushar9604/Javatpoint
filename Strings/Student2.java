class Student2{
	int rollno;
	String name;
	String city;
	
	Student2(int rollno, String name, String city){
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	public String toString(){//overriding the toString() method
	return rollno+" "+name+" "+city;
	}
	
	public static void main(String[] args){
		Student2 s1 = new Student2(101,"Raj","Lucknow");
		Student2 s2 = new Student2(102,"Vijay","Ghaziabad");
		
		System.out.println(s1); // compiler writes s1.toString()
		System.out.println(s2); // compiler writes s2.toString()
	}
}