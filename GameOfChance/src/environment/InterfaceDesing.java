package environment;
import java.awt.*;
import java.awt.event.*;



public class InterfaceDesing 
{
	private Frame frame;	
	private Button button;
	private Label label;
	private Label result;

	public InterfaceDesing() 
		{
			frame = new Frame();
			button = new Button("ROLL THE DICE");
			label = new Label("WELCOME PLAYER");
			result = new Label("");
		
			frame.setSize(600, 600); 
			frame.setLayout(null); 
			frame.setVisible(true); 
			frame.setLocationRelativeTo(null);
		
			label.setBounds(230, 50, 170, 20);
			button.setBounds(230, 350, 150, 20);
			
			result.setBounds(200, 120, 400, 100);
			result.setVisible(false);
			
			frame.add(label);
			frame.add(button);
			frame.add(result);
			button.addActionListener(new Listener1());
		}
	
	private class Listener1 implements ActionListener
		{

		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			SixFacesDie die = new SixFacesDie();
			int firstDie = die.rollDice();
			int secondDie = die.rollDice();
			int sum = firstDie + secondDie;
	
			result.setText(firstDie+" + "+ secondDie + " = " + sum);
			result.setVisible(true);
			result.setFont(new Font("Verdana", Font.BOLD, 20));
			
			
			}
		
		} 
	
		

	public static void main(String arg[]) 
		{
	
		InterfaceDesing framePrueba = new InterfaceDesing();

		}

}