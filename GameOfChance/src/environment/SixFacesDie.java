package environment;
import java.security.*;


public class SixFacesDie {

	
	private int face;
	 
	public int rollDice() {
		SecureRandom random = new SecureRandom();
		int randomNumber = 1 + random.nextInt(6);
		face = randomNumber;
		return face;
	}
	
	
}
