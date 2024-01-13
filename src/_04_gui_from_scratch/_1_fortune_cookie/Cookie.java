package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Fortune");
	public void showButton() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand==0) {
		JOptionPane.showMessageDialog(null, "You will be very fat!");	
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will become rich!");	
			}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will meet your fate very soon!");	
			}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "Your enemy will become your closest friend!");	
			}
		if(rand==4) {
			JOptionPane.showMessageDialog(null, "Luck may not be on your side!");	
			}
	}
	
}
