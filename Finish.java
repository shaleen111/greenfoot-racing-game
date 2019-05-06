import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends Actor
{
    /**
     * Act - do whatever the finish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(!getIntersectingObjects(Car.class).isEmpty())
        {
            String player = getIntersectingObjects(Car.class).get(0).name;
            getWorld().addObject(new GameOver(player + " Won"), 600, 320);
        }
    }    
}
