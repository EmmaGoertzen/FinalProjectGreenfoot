import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class Pufferfish extends Actor
{
    /**
     * Act - do whatever the Pufferfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        moveDown();
        removeBotPufferfish();
        getImage().scale(200, 200);
    }  
    
    public void moveDown()
    {   
         setLocation( getX(), getY() + 1);
    } 

    public void removeBotPufferfish()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
    }
    
}
