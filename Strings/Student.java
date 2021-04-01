class Student{
	int rollno;
	String name;
	String city;
	
	Student(int rollno,String name, String city){
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	public static void main(String args[]){
		Student s1 = new Student(101,"Raj","Lucknow");
		Student s2 = new Student(102,"Vijay","Ghaziabad");
		
		System.out.println(s1); // compiler writes s1.toString()
		System.out.println(s2); // compiler writes s2.toString()
	}
}