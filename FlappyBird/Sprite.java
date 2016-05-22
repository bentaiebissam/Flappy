import com.sun.prism.Graphics;

abstract class Sprite
{ 

   int x ;
   int y ;
   int h ;
   int w ;
   int frames ;
public boolean retract;
   
   abstract void update() ;
   abstract void draw (java.awt.Graphics g) ;
   abstract boolean isBird() ;
   abstract void onClick();
   abstract int isTube() ;

	
	}