
public class CarTest {

	public static void main (String[] args) {
		
		Car hondaCivic=new Car("Honda",(short)2023,"Civic","White");
		
		hondaCivic.changeGear('P');
		hondaCivic.start();
		
		System.out.println(hondaCivic);
		
		hondaCivic.stop();
		System.out.println(hondaCivic);
		
		
	}
}
