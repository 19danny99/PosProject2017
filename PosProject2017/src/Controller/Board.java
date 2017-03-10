package Controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {


 Image img;

	public Board() { 

		setFocusable(true);
		ImageIcon u = new ImageIcon(getClass().getResource("background.png"));
		img = u.getImage();

}


	public void paint (Graphics g){
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;


		g2d.drawImage(img,0,0,null);
}
}

