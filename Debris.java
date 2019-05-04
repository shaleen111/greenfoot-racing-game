import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends Actor
{
    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed;
    public Debris()
    {
        int direction = Greenfoot.getRandomNumber(360);
        this.speed = Greenfoot.getRandomNumber(10);
        turn(direction);   
    }
    public void act() 
    {
        // Add your action code here.
        move(this.speed);
        if(this.speed < 10)
        {
            speed += 1;
        }
    }    
}
