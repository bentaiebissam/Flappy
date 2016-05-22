import javax.swing.JPanel;



import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Iterator;
import java.awt.Graphics;
import java.io.File;
class View extends JPanel {
	//private static final String modem = null;
	Model model;

	

	View(Model m) throws IOException {
		this.model = m;
	//	this.bird1_image = ImageIO.read(new File("bird1.png"));
		//this.bird2_image = ImageIO.read(new File("bird2.png")) ;
	//	this.tube_up = ImageIO.read(new File("tube_up.png")) ;
		//this.tube_down = ImageIO.read(new File("tube_down.png")) ;
		
	}

	public void paintComponent(Graphics g) {

		
		// Draw the scence
		//iterating through all the tubes to draw them
		
		Iterator<Sprite> iter =  this.model.sprites.iterator() ;
		
		 while (iter.hasNext())
		 {	
			  Sprite s = iter.next() ; 
			  s.draw(g);	
		 }
		 
	}
}
