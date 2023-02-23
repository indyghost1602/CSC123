
public class Circle {

	public int radius;
	public String circleName;
	
	public Circle(String circleName, int radius) {
		this.radius = radius;
		this.circleName = circleName;
	}
	
	

	public String toString() {
		String s=circleName+" \nRadius: "+radius+" \nArea: "+(3.14*(radius*radius))+" \nCircumference: "+(2*3.14*radius);
		return s;
	}
	
	
	
}
