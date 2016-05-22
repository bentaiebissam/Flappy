import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.imageio.ImageIO;

import com.sun.prism.Graphics;

class Bird extends Sprite
{
	 static Image bird1_image; //wings up
	 static Image bird2_image; //wings down
	 static Image feathers ;
	double velocity ;
	int k ; // Bird up or down
	LinkedList<Sprite>  sprites ;
	boolean life ;
	
	Bird (LinkedList<Sprite> s )
	{	sprites = s ;
		k= 0 ;
		x = 10 ;
		y= 100 ;
		velocity = 0 ; 
		 w = 64  ;
		 h = 57  ;
		 life = true;
		 try
		 {bird1_image = ImageIO.read(new File("bird1.png"));
		 bird2_image = ImageIO.read(new File("bird2.png")) ;
		 feathers =ImageIO.read(new File("feathers.png")) ;
		 }
		 catch(IOException e) 
		 {
		 e.printStackTrace() ; }
		 }
	
		 
	
	public void update ()
	{  if (life==true)
			{
		if (this.y <= 700 || this.y >= -200 )
		{
		this.velocity +=0.07;
		this.y += this.velocity ;
		}
		else
		{ life = false ; 
		
		}}
		if(life==false) 
		{this.velocity += 1 ;
		this.x+=4 ;
		this.y += this.velocity ;
		   if (this.y >500) this.velocity = -18 ;
		   if (this.x >450) System.exit(0);
	}
		
		
		ListIterator<Sprite> iter = sprites.listIterator() ;
		while (iter.hasNext())
		{	Sprite s = iter.next() ;
		 	int o =s.isTube();
			if (o>=0) {
				if (o==0)
				if(this.x  +this.w > s.x && this.x < s.x + s.w  && this.y < s.y) life=false ;
			 
			if (o==1) {
				if(this.x + this.w > s.x && this.x  < s.x + s.w && this.y  + this.h > s.y)
				
					life =false ;}}
		
			

			if (life == false)
			{System.out.println("you hit something");
			}
		
		}
	}
		
	public void onClick ()
	{   
		this.velocity = -4 ;
		this.k=1 ;
		
	}
	
	 boolean isBird()
	{
		return true ;
	}
	 
	 int isTube()
		{
			return -1 ;
		}
	
	
	void draw (java.awt.Graphics g)
	{	if (life==true){
		if(this.k == 0)
		{
		g.drawImage(bird1_image, this.x, this.y, null);}//UPWARD TUBE
		else 
		{   
		g.drawImage(bird2_image, this.x, this.y, null);
		this.k ++ ;
		if (this.k ==3) this.k = 0 ;
		
		} }
	if (life==false) g.drawImage(feathers, this.x, this.y, null);
	}
}

