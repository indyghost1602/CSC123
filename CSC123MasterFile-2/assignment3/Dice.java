import java.util.Random;
public class Dice {

	String rand;
		
	public void cast() {
		Random random= new Random();
		int randInt=random.nextInt(100);
		rand=Integer.toString(randInt);
		
	}
	
	public String toString() {
	String s=rand;
	return s;
	}
}
