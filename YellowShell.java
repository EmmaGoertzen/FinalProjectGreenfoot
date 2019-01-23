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
        removeShells();
    }  
    /**
     * moves the shell down the screen once in the world
     * 
     * @param none
     * @return none
     */
    public void moveDown()
    {   
         setLocation( getX(), getY() + 3);
    } 
    /**
     * removes the shell once it hits the bottom of the screen
     * also adds points  
     * 
     * @param none
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
            world.addScore(30);
        }
    }
}
