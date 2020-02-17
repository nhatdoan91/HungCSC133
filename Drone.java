package com.mycompany.a1;
import java.util.Random;

import com.codename1.charts.util.ColorUtil;
public class Drone extends Movable  {
	Random random = new Random();
	public Drone () {
		super(ColorUtil.BLUE);
		final int MIN_SIZE = 10;
    	final int MAX_SIZE = 50;
		super.setSize(new Random().nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE); 
		super.setHeading(random.nextInt(360));
		super.setSpeed(random.nextInt(10));
	}
	
	@Override
	public String toString() {
		return ("Drone: loc= " + Math.round(this.getX()* 10)/ 10  +","+ Math.round(this.getY()*10)/10 +
    			"  color= " + this.getColortoString() + 
    			"  size= " + this.getSize()+
    			"  heading="+ this.getHeading()+
    			"  speed= " + this.getSpeed()
    			);
	}
	
	public void setSize(int size) {}
//	public void setLocation(float x, float y) {
//		super.setLocation(x, y);
//	}
	public void setColor(int color){}
	public void move() {
		this.setHeading(super.getHeading()+random.nextInt(5));
	}
//public void flyOverTrack() {
//		
//		if(this.getX() == base.getX() && this.getY() == base.getY()) {
//			float newX = this.getX();
//			float newY = this.getY();
//			this.setX(newX+1);
//			this.setY(newY+1);
//		}	
//	}
}
