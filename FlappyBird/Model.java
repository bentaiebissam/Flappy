import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

class Model
{
	
	
	LinkedList<Sprite> sprites ;
	Bird bird ;
	int frames ;
	
	Model() {
		
		frames = 0 ; 
		sprites =new LinkedList<Sprite>() ;
		bird = new Bird(sprites) ;
		sprites.add(bird) ;		
		sprites.add(new Tube());
		
		
		
	}

	public void update()
	{	this.frames ++ ;
		 ListIterator<Sprite> iter = sprites.listIterator() ;
		
		//after certain frames we add a new tube
		if (this.frames == 180)
		{
			iter.add(new Tube());
		 this.frames = 0 ;
		
		}
		
		
		
		while (iter.hasNext())
		{
		  Sprite s = iter.next() ;
		  s.update() ;
	}
		
	}
	
	
		
	
}

