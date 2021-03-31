// Creating the custom wrapper class
class Javatpoint{
	private int i;
	Javatpoint(){}
	
	Javatpoint(int i){
		this.i=i;
	}
	
	public int getValue(){
		return i;
	}
	
	public void setValue(int i){
		this.i = i;
	}
	
	@Override
	public String toString(){
		return Integer.toString(i);
	}
}

// Testing the custom wrapper Class

public class TestJavatpoint{
	public static void main(String[] args){
		Javatpoint j = new Javatpoint(10);
		System.out.println(j);
	}
}