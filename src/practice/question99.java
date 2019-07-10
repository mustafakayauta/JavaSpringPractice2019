package practice;

public class question99 {

	public static int stvar=100;
	public int var=200;
	
	public String toString() {
		
		return(var+" : "+stvar);
		
	}
public static void main(String[] args) {
	
	
	question99 t1=new question99();
	t1.var=300;
	question99 t2=new question99();
	t2.stvar=300;
	System.out.println(t1);
	System.out.println(t2);
	
}

}
