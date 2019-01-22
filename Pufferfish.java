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
        removePufferfish();
    }  
    
    public Pufferfish()
    {
        GreenfootImage image = getImage();
        image.scale(70, 70);
        setImage(image);
    }
    public void moveDown()
    {   
         setLocation( getX(), getY() + 1);
    } 

    public void removePufferfish()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Mermaid.class))
        {
            SeaWorld world = (SeaWorld) getWorld();
            getWorld().removeObject(this);
            world.addScore(-50);
        }
    }
    
}
