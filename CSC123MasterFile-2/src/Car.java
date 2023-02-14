
public class Car {
		
		//Fields
		public String make;
		public short year;
		public int mileage;
		public String model;
		public String color;
		public boolean engineRunning;
		public char gear; //'R','N','D','P'
		public int currentSpeed;
		public boolean ignitionState;
		public int fuelLevel;
		
		//Constructors
		public Car(String make, short year, String model, String color) {
			this.make = make;
			this.year = year;
			this.model = model;
			this.color = color;
			engineRunning=false;
			gear='N';
			currentSpeed=0;
			ignitionState=false;
			fuelLevel=0;
			
		}	
		
		public String toString() {
			String s="Engine Running: "+engineRunning+", Gear ="+gear;
			return s;
		}
		
		public void start() {
			if(gear=='P')engineRunning=true;
		}
		
		public void changeGear(char g) {
			gear=g;
		}
		
		public void stop () {
			engineRunning=false;
		}
	}
