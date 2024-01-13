package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Videos implements MouseListener {	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton videoA = new JButton("VideoA");
	JButton videoB = new JButton("VideoB");
	JButton videoC = new JButton("VideoC");

	void run() {
		frame.add(panel);
		panel.add(videoA);
		panel.add(videoB);
		panel.add(videoC);
		frame.setVisible(true);
		frame.pack();
		
		videoA.addMouseListener(this);
		videoB.addMouseListener(this);
		videoC.addMouseListener(this);
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=0tOXxuLcaog");
	}

	void playVideo(String videoID) {

		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		//work on some Linux implementations 
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { 
						"which", "xdg- open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}      } catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked==videoA) {
		showDucks();	
		}
		if(buttonClicked==videoB) {
			showFrog();	
			}
		if(buttonClicked==videoC) {
			showFluffyUnicorns();	
			}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
