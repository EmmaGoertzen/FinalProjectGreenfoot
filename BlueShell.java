import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class BlueShell extends Actor
{
    /**
     * Act - do whatever the BlueShell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        moveDown();
        removeShells();
    }  
    /**
     * moves the blue shell down 
     * 
     * @parm none
     * @return none
     */
    public void moveDown()
    {   
         setLocation( getX(), getY() + 1);
    } 
    
    /**
     * removes the shell when it hits the bottom of the screen
     * also adds points
     * 
     * @parm none
     * @return none
     */
    public void removeShells()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Mermaid.class))
        {
            SeaWorld world = (SeaWorld) getWorld();
            getWorld().removeObject(this);
            world.addScore(5);
        }
    }
}
