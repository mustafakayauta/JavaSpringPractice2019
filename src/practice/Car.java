package practice;

public class Car extends Vehicle{

	String trans;
	
	Car(String trans)
	{
		//super();
		this.trans=trans;
	
	}
	
	Car(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		this.trans=trans;//Line-2
	
	
	}
}
