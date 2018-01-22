package swingViews;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class NewImage extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage imageBG;
	BufferedImage imageLogo;
	
	public NewImage() {
		
		setLayout(new BorderLayout());
        try {          
            imageBG = ImageIO.read(new FileInputStream("src/images/fotoCRM.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imageBG != null) {
            int x = (getWidth()- imageBG.getWidth())/2 ;
            int y = (getHeight()- imageBG.getHeight())/2 ;
            g.drawImage(imageBG, x, y, this);
        }
    }

}
