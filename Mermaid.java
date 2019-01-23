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
    /**
     * moves the mermaid when the a or d keys are pressed 
     * 
     * @parm none
     * @return none
     */
    private void move()
    {
        if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        
        if(Greenfoot.isKeyDown("a")){
            move(-2);
        }
    }
}
