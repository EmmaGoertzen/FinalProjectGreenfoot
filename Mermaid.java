import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class Mermaid extends Actor
{
    int points;
    /**
     * Act - do whatever the Mermaid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    } 
    private void move()
    {
                 if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        
        if(Greenfoot.isKeyDown("a")){
            move(-2);
        }
    }
    private void chechForShells()
    {
        if(isTouching(PurpleShell.class))
        {
            removeTouching(PurpleShell.class);
            points = points + 10;
        }
    }
}
