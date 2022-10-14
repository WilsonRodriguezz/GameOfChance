package environment;
import javax.swing.JOptionPane;
/**
 * @author LilGrizzly
 *
 */
public class GameDriver {
	
	public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("Please enter your name");
	System.out.println("------Welcome to the Game Of Chance------");
	System.out.printf("Hello %s. ", name);
	System.out.printf("%nThe rules of this game are simple.%nRoll two dice.%nIf you score 7 or 11 you win.%nIf you score 2, 3 or 12 you lose.%n%nIf you do not get any of the results above. Read the following instructions: %nYou need to roll your dice again until you get the score of your first try.%nBut if you get 7 or 11 in any of these tries, you lose.");
	int firstTry = shot();
	JOptionPane.showMessageDialog(null, "roll your dice");
	System.out.printf("%n%nThe result of the first shot is: %d%n", firstTry);
	
	if(firstTry == 7 || firstTry == 11) {
		
		System.out.printf("%nYou won");	
		JOptionPane.showMessageDialog(null, "Game Over");
		}
	else if(firstTry == 2 || firstTry == 3 || firstTry == 12) {
			System.out.printf("%nYou lost");
			JOptionPane.showMessageDialog(null, "Game Over");
		}
	else {
		System.out.printf("%nYou Keep playing%n%n");
		int secondTry = shot();
		JOptionPane.showMessageDialog(null, "roll your dice");
		System.out.printf("%nThe result of this shot is: %d%n", secondTry);
		if(secondTry == 7 || secondTry == 11) {
		System.out.printf("%nYou lost%n%n");
		}
		else if(secondTry == firstTry) {
			System.out.printf("%nYou won");	
			JOptionPane.showMessageDialog(null, "Game Over");
		}
		else {
			int resultScore= 0;
			int i = 3;
			int finalizer = 0;
			while(finalizer != 7 && finalizer != 11 && finalizer != firstTry){
					resultScore = shot();
					JOptionPane.showMessageDialog(null, "roll your dice");
					System.out.printf("%nThe result of the try number %d is: %d", i, resultScore);
					i++;
					finalizer = resultScore;
				}
				
				if(resultScore == 7 || resultScore == 11) {
						System.out.printf("%nYou lost%n%n");
						JOptionPane.showMessageDialog(null, "Game Over");
					}
					else {
						System.out.printf("%nYou won%n%n");
						JOptionPane.showMessageDialog(null, "Game Over");
					}
				
			}
		
		}	
	}
	
	
	public static int shot() {
		SixFacesDie die = new SixFacesDie();
		int firstDie = die.rollDice();
		int secondDie = die.rollDice();
		int shotScore = firstDie + secondDie;
		return shotScore;
	}
}