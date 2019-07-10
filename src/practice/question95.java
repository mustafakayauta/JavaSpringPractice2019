package practice;

public class question95 {
public static void main(String[] args) {
	System.out.println(args.length);

	int data [] = {2010,2013,2014,2015,2014};
	int key = 2014;
	int count = 0;
	for(int e : data){
	if(e != key){
	continue;
//	count++; //unreachable code
	}
	}
	System.out.print(count + "Found");
	}
}
