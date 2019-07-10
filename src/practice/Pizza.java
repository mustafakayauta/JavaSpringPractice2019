package practice;

public class Pizza {

private String size;

private int cheeseTopping;

private int pepperoniToppings;

private int hamToppings;



public Pizza(String size,int toppings,int pepperoniToppings,int hamtoppings) {

	this.size=size;
	this.cheeseTopping=toppings;
	this.pepperoniToppings=pepperoniToppings;
	this.hamToppings=hamtoppings;
	
}



public String getSize() {
	return size;
}



public void setSize(String size) {
	this.size = size;
}



public int getToppings() {
	return cheeseTopping;
}



public void setToppings(int toppings) {
	this.cheeseTopping = toppings;
}



public int getPepperoniToppings() {
	return pepperoniToppings;
}



public void setPepperoniToppings(int pepperoniToppings) {
	this.pepperoniToppings = pepperoniToppings;
}



public int getHamToppings() {
	return hamToppings;
}



public void setHamToppings(int hamToppings) {
	this.hamToppings = hamToppings;
}

public double calcCost() {
	double price=0.0;
	if(size.equalsIgnoreCase("small")) {
		price=10+(2*pepperoniToppings)+(2*hamToppings)+(2*cheeseTopping);
	}
	if(size.equalsIgnoreCase("medium")) {
		price=12+(2*pepperoniToppings)+(2*hamToppings)+(2*cheeseTopping);
	}
	if(size.equalsIgnoreCase("large")) {
		price=12+(2*pepperoniToppings)+(2*hamToppings)+(2*cheeseTopping);
	}
	
	
	
	
	return 0.0;
}
public String getDescription() {

	String a=size +"Pizza with "+cheeseTopping+ " Cheese topping, "+pepperoniToppings+" Pepperoni toppings, and "+hamToppings+" Ham toppings. Total Price: "+price);
	return 
}

}
