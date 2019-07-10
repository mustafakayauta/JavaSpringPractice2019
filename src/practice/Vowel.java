package practice;

public class Vowel {

	private char var;
	
	public static void main(String[] args) {
		char var1='a';
		char var2=var1;
		System.out.println(var2);
		var2='e';
		
		Vowel obj1=new Vowel();
		System.out.println(obj1.var);
		Vowel obj2=obj1;
		System.out.println(obj2.var);
		
		obj1.var='i';
		System.out.println(obj1.var);
		obj2.var='o';
		obj1.var='m';
		System.out.println(obj1.var);
		System.out.println(obj2.var);
	}
}
