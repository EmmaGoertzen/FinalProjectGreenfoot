import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    int points;
    private Font myFont = new Font("Pixle", true, false, 24);

    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    public void addToScore(int pointsAdded) 
    {
        points += pointsAdded;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score: " + points, 5, 25); 
   
    }    
}