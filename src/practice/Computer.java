package practice;


	public class Computer {

		
		public void screen() {
			System.out.println(" Computer screen ");
		}
		public void Ram(String type,int Size) {
			type="4d";
			Size=8;
			
		}
		}
	
	class Laptop extends Computer{
		public void screen() {
			System.out.println(" Laptop screen ");
	}
	
		public void Ram(int Number,boolean dogru) {
			Number=16;
			dogru=true;
			
		}
	}
	
	class Desktop extends Computer{
		public void screen() {
			System.out.println(" Desktop screen ");
	}
		public void Ram(char a,short b) {
			
			 a='c';
			
			 b=12;			
		}
	
	}
	

