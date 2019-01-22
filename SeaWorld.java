import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**                                                                             
 * ALL art was created by me
 * 
 * @author (Emma) 
 * @version (1/15/2019)
 */
public class SeaWorld extends World
{
    private int counter;
    private Scoreboard scoreboard = new Scoreboard();
    /**
     * Constructor for objects of class SeaWorld.
     * 
     */
    public SeaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject( new Mermaid(), getWidth()/2, 500);
        addObject(scoreboard, 70, 50);
    }
     public void act()
    {
        addShells();
        counter++;
        starterText();
    }
    
    public void addShells()                                                     
    {
        if( Greenfoot.getRandomNumber(600) <1 && counter >= 5200)
        {
            addObject( new PurpleShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1 && counter >= 5200)
        {
            addObject( new BlueShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(600) <1 && counter >= 5200)
        {
            addObject( new PinkShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(900) <1 && counter >= 5200)
        {
            addObject( new YellowShell(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(800) <1 && counter >= 5200)
        {
            addObject( new Pufferfish(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
        if( Greenfoot.getRandomNumber(1500) <1 && counter >= 5200)
        {
            addObject( new Anchor(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
    }
    private void starterText()
    {
        if(counter >= 0 && counter < 400)
        {
            showText("Welcome to the deep sea", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 400 && counter < 800)
        {
            showText("Here are the game play rules", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 800 && counter < 1200)
        {
            showText("Blue shells are worth 5 points", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 1200 && counter < 1600)
        {
            showText("Purple shells are worth 10 points", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 1600 && counter < 2000)
        {
            showText("Pink shells are worth 20 points", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 2000 && counter < 2400)
        {
            showText("Yellow shells are worth 30 points", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 2400 && counter < 2800)
        {
            showText("A puffer fish will remove 50 points", getWidth()/2, getHeight()/2);
        }
        else if(counter >= 2800 && counter < 3200)
        {
            showText("An anchor will kill you", getWidth()/2, getHeight()/2);
        }
        else if(counter <= 3200 && counter < 3600)
        {
            showText("So basically catch shells, don't die, have fun!", getWidth()/2, getHeight()/2);
        }
        else if(counter <= 3600 && counter < 4000)
        {
            showText("Use the a and d keys to move", getWidth()/2, getHeight()/2);
        }
        else if(counter <= 4000 && counter < 4400)
        {
            showText("Ready...", getWidth()/2, getHeight()/2);
        }
        else if(counter <= 4400 && counter < 4800)
        {
            showText("Set...", getWidth()/2, getHeight()/2);
        }
        else if(counter <= 4800 && counter < 5200)
        {
            showText("GO!!!", getWidth()/2, getHeight()/2);
        }
        else
        {
            showText(" ", getWidth()/2, getHeight()/2);
        }
    }
    public void addScore(int pointsAdded)
    {
        scoreboard.addToScore(pointsAdded);
        
    }
}
