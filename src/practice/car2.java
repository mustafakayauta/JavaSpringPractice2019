package practice;

public class car2 extends Vehicle2{
	int y;
	
	 car2() {
	super();
	//this(20);
	}

car2(int y){
	this.y=y;
}

public String toString() {
	
	return super.x+ ":"+this.y;
}


}
