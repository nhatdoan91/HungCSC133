package com.mycompany.a1;
import java.util.Random;
import com.codename1.charts.util.ColorUtil;
import java.util.Random;
public class EnergyStation extends Fixed{

	Random random = new Random();
    private int capacity;
    public EnergyStation() {
    	super(ColorUtil.GREEN);

    	final int MIN_SIZE = 10;
    	final int MAX_SIZE = 50;
		super.setSize(new Random().nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE); 
    	this.capacity = this.getSize();
    }

    public String toString() {
    	return ("EnergyStation: loc= " + Math.round(this.getX()* 10)/ 10 +"," + Math.round(this.getY()*10)/10 +
    			"  color= " + this.getColortoString() + 
    			"  size= " + this.getSize()+
    			"  capacity="+ this.getCapacity()
    			);
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setSize(int size){}
    
    public void setColor(int color){}
   
    public boolean checkEnergyStation()
    {
        if (capacity == 0)
            return false;
        else
            return true;
    }
}
