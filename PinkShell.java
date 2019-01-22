import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class PinkShell extends Actor
{
    private int setX = 0;
    private boolean newObject = true;
    /**
     * Act - do whatever the PinkShell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        if(newObject == true)
        {
            setX = getX();
            newObject = false;
        }
        moveDown();
        removeShells();
        getImage().scale(50, 50);
    }  
    
    public void moveDown()
    {   
         setLocation( getX(), getY() + 1);
         if(Greenfoot.getRandomNumber(2) == 0)
         {
             setX = setX+15;
         }
         else
         {
             setX = setX-15;
         }
         if(setX > getX())
         {
             setLocation( getX() + 1, getY());
         }
         else
         {
             setLocation( getX() - 1, getY());
         }
    } 

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
            world.addScore(20);
        }
    } 
        public PinkShell()
    {
        GreenfootImage image = getImage();
        image.scale( 100, 100);
        setImage(image);
    }
}
