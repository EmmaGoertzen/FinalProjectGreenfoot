import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**                                                                             
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class SeaWorld extends World
{
    int counter;

    /**
     * Constructor for objects of class SeaWorld.
     * 
     */
    public SeaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject( new Mermaid(), getWidth()/2, 500);
        
    }
     public void act()
    {
        addShells();
        counter++;
        starterText();
    }
    
    public void addShells()                                                     
    {
        if( Greenfoot.getRandomNumber(600) <1)
        {
            addObject( new PurpleShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1)
        {
            addObject( new BlueShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1)
        {
            addObject( new PinkShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1)
        {
            addObject( new YellowShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1)
        {
            addObject( new Pufferfish(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
    }
    private void starterText()
    {
        showText("Welcome to the deep sea", getWidth()/2, getHeight()/2);
        if(counter >= 40)
        {
            showText(" ", getWidth()/2, getHeight()/2);
        }
        
    }
}
