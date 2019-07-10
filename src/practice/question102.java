package practice;

public class question102 {
public static void main(String[] args) {
	int wd=0;
	String []days= {"sun","mon","wed","sat"};
	
	for(String s:days) {
		switch (s) {
		case "sat":
	System.out.println(wd);
		case "sun":
				wd-=1;
				System.out.println(wd);
				break;
		case "mon":
		wd+=1;
		System.out.println(wd);
		case "wed":
			System.out.println(wd);
			wd+=2;

		
		}
		
	}
System.out.println(wd);
}
}
