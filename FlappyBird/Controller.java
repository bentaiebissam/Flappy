import java.awt.event.MouseListener;
import java.util.ListIterator;

import javax.swing.SwingUtilities;

import java.awt.event.MouseEvent;

class Controller implements MouseListener
{
	Model model;

	Controller(Model m) {
		this.model = m;
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {    }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) { if (SwingUtilities.isLeftMouseButton(e)) 	{ 
		ListIterator<Sprite> iter = this.model.sprites.listIterator() ;
		while (iter.hasNext())
		{	Sprite s = iter.next();
			 if (s.isBird()) s.onClick () ;
		}
		} 
	
		if(SwingUtilities.isRightMouseButton(e) ){
			ListIterator<Sprite> iter = this.model.sprites.listIterator() ;
			while (iter.hasNext())
			{	Sprite s = iter.next();
				 if (s.isBird()) iter.add(new Pie(s.x,s.y,this.model.sprites)); ;
			}
			
		
		}
		}
		
		
		

}
