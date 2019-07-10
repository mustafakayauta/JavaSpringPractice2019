package practice;

class WildAnimal extends Animal {
	String bounds;

	WildAnimal(String bounds) {
super();
		this.bounds=bounds;
	}

WildAnimal (String type, int maxSpeed, String t){
super(type,maxSpeed);
this.bounds=t;
}

}
