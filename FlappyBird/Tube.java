import java.util.Random;

import javax.imageio.ImageIO;

import com.sun.prism.Graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;


class Tube extends Sprite
{
	static Image tube_up ;
	static Image tube_down ;
	int pos ;
	boolean okay ;	
	boolean retract ;	
	int score ;
	
		Tube () 
		{
			retract = false ;
			Random randomGenerator = new Random() ;
			this.x = 450;
			okay = true ;
			pos = randomGenerator.nextInt(2);
			if (pos==0) 
			y = randomGenerator.nextInt(400);
			else y=500-randomGenerator.nextInt(400);
			
			System.out.println(pos);

			h = 400 ;
			w = 55  ;
		System.out.println(pos);
		
		try
		{tube_up = ImageIO.read(new File("tube_up.png")) ;
		tube_down = ImageIO.read(new File("tube_down.png")) ;
	    }
		
		catch(IOException e) 
		{
			e.printStackTrace() ; }
		}
		
		void setretract(boolean value)
		{
			this.retract= value ;
		}
	 
		public void onClick() { 	
			
		}
 boolean isBird()
		{
			return(false );
		}
		
	 int isTube()
		{
			return this.pos ;
		}
		
	void update ()
		
		{ 	
		this.x -=1 ;
		if (this.x>50) {
		if (retract==true)
		{ if (this.pos==1){this.y+=4 ; }
		if(this.pos==0) { this.y -= 4 ;}
		}
		}
		}
	
	void draw(java.awt.Graphics g)
	{	
		if (this.pos==0) g.drawImage(tube_down, this.x,this.y-400, null);
		else g.drawImage(tube_up, this.x, this.y, null);
			

		 				}
	
	}  
	


