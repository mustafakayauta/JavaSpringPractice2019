package practice;

public class Test1 {

	int x,y;
	
	public Test1(int x,int y) {
		
		initialize(x, y);
	}
	public void initialize(int x,int y) {
		
		this.x=x*x;
		this.y=y*y;
	}
	public static void main(String[] args) {
		
		int x=3, y=5;
		
		Test1 obj=new Test1(x,y);
		
		System.out.println(obj.x+" "+obj.y);
		
	}
	
	
}
