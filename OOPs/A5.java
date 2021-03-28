class A5 {
	
	void m(){
		System.out.println(this); //prints same reference IDLEntity
	}
	
	public static void main(String[] args){
		
		A5 obj = new A5();
		
		System.out.println(obj);
		
		obj.m();
	}
}