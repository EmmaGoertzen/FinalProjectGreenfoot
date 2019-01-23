import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class PurpleShell extends Actor
{
    int points;
    /**
     * Act - do whatever the PurpleShell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param none
     * @return none
     */
    public void act() 
    {      
        moveDown();
        removeShells();
    }  
    /**
     * moves the PurpleShell down the screen once its been added to the 
     * world
     * 
     * @param none
     * @return none
     */
    public void moveDown()
    {   
         setLocation( getX(), getY() + 2);
    } 
    /**
     * removes the shell once its hit the bottom of the world
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
            world.addScore(10);
        }
    }
    
}
