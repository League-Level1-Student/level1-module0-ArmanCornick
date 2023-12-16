package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Affect implements MouseListener {
	JFrame frame = new JFrame("Sound Board");
	JPanel panel = new JPanel();
	JButton pipe = new JButton("pipe");
	JButton fart = new JButton("fart");
	JButton fart2 = new JButton("fart2");
	JButton yahoo = new JButton("yahoo");
	JButton win = new JButton("win");
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
		}
		else {
			System.out.println("File does not exist");
		}

	}

	public static void main(String[] args) {	
		Affect thing = new Affect();
		thing.gui();
	}

	public void gui() {
		pipe.addMouseListener(this);
		fart.addMouseListener(this);
		fart2.addMouseListener(this);
		yahoo.addMouseListener(this);
		win.addMouseListener(this);

		frame.add(panel);
		panel.add(pipe);
		panel.add(fart);
		panel.add(fart2);
		panel.add(yahoo);
		panel.add(win);
		frame.setVisible(true);
		frame.pack();		
	}

	public void mouseClicked (MouseEvent e) {
		JButton buttonClicked = (JButton) e.getSource();	
		if (buttonClicked==(pipe)) {
			playSound("pipe.wav");
		}
		if (buttonClicked==(fart2)) {
			playSound("fart2.wav");
		}
		if (buttonClicked==(fart)) {
			playSound("fart.m4a");
		}
		if (buttonClicked==(win)) {
			playSound("win.wav");
		}
		if (buttonClicked==(yahoo)) {
			playSound("yahoo.wav");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
