package RockPapersScissors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HeightCalculator extends JFrame implements ActionListener {
	
	static String height = " ";
	
	public HeightCalculator() {
    
    }
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("height calculator");
        JButton button = new JButton("submit");
        JTextField heightinput = new JTextField(" ", 16);
        JLabel label = new JLabel("Enter your height in cm: ");
        JPanel panel = new JPanel();
        HeightCalculator hc = new HeightCalculator();
        JFrame calculatedHeight = new JFrame("Your height has been calculated you moron");
        JLabel heightcal = new JLabel(String.format("You are %s cm tall", height));
        
        button.addActionListener(hc);
        panel.add(label);
        panel.add(heightinput);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.show();
        calculatedHeight.add(heightcal);
        
       button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (button.isEnabled()) {
				height = Integer.parseInt(heightinput.getText());
				heightinput.setText(Integer.toString(height));
				calculatedHeight.show();
			}
			
		}});
        
       
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
