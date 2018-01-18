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
	BufferedImage image;
	
	public NewImage() {
		
		setLayout(new BorderLayout());
        try {          
            image = ImageIO.read(new FileInputStream("src/images/fotoCRM.jpg"));
           
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int x = (getWidth()- image.getWidth())/2 ;
            int y = (getHeight()- image.getHeight())/2 ;
            g.drawImage(image, x, y, this);
        }
    }

}
