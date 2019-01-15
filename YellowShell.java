import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class YellowShell extends Actor
{
    /**
     * Act - do whatever the YellowShell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        moveDown();
        removeBotShells();
    }  
    
    public void moveDown()
    {   
         setLocation( getX(), getY() + 3);
    } 

    public void removeBotShells()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
    }
}
