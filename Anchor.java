import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anchor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anchor extends Actor
{
    /**
     * Act - do whatever the Anchor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        moveDown();
        removeAnchor();
        getImage().scale(100, 100);
    }  
    /**
     * moves the anchor down 
     * 
     * @parm none
     * @return none
     */
    public void moveDown()
    {   
         setLocation( getX(), getY() + 2);
    } 
    /**
     * removes the anchor when it hits the bottom of the screen
     * 
     * @parm none
     * @return none
     */
    public void removeAnchor()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Mermaid.class))
        {
            Greenfoot.stop();
            getWorld().removeObject(this);
        }
    }
}
