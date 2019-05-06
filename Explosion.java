import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer;
    //static boolean isPlay = true;
    
    public Explosion()
    {
        Greenfoot.playSound("boom.wav");
    }
    
    public void act() 
    {
        // Add your action code here.
        if(this.timer >= 160)
        {
             getWorld().removeObject(this);
        }
        timer++;
    }  
}
