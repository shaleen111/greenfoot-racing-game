import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String name = "";
    public GameOver(String name)
    {
        this.name = name;
        setImage(new GreenfootImage("Game Over : " + this.name, 60, Color.WHITE, Color.BLACK));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
