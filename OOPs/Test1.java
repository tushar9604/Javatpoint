class A{
	
	A getA(){
		return this;
	}
	
	void msg(){System.out.println("Hello java");}
}

class Test1{
	
	public static void main(String[] args){
		
		new A().getA().msg();
	}
}
