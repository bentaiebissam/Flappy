import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.imageio.ImageIO;

class Pie extends Sprite
{
	static Image pie ;
	boolean used ;
	double velocity ;
	LinkedList<Sprite>  sprites ;

	
	
	Pie (int x,int y, LinkedList<Sprite> s)
	{	this.sprites = s ;
	velocity =-5;
		this.x=x ;
		this.y=y ;
		this.w=40;
		this.h=25;
		used = false ;
		 try
		 {;
		pie = ImageIO.read(new File("pie.png")) ;}
			catch(IOException e) 
			{
				e.printStackTrace() ; }
	}
	
	void update(){
		if (used == false) {
		x += 2 ;
		if (this.y <= 1000 || this.y >= -600 )
		{
		this.velocity +=0.07;
		this.y += this.velocity ;
		}
		
		ListIterator<Sprite> iter = sprites.listIterator() ;
		while (iter.hasNext()&& (used==false))
		{	Sprite s = iter.next() ;
		 	int o =s.isTube();
		 	if (o>=0)
		 		{ Tube t = (Tube )s ;
		 		if(	this.x >  s.x && t.retract==false &&((o==0 && this.y <t.y)||(o==1 && this.y>t.y) && this.x +this.w < s.x+s.w 	)) {
		 		 		
		 		used =true ;
		 		t.setretract(true) ;
		 		
		 		}
		}}}
		else 
		{y +=12 ;
		 
		}		
	}
		
		
	void draw (java.awt.Graphics g)
	{
		g.drawImage(pie, this.x, this.y, null);
	}
		
	
	
	boolean isBird()
	{return false ; }
	int isTube()  {return -1 ;}

	
	void onClick(){
		
	}
}
