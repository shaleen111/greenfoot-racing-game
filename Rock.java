import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(!getIntersectingObjects(Car.class).isEmpty())
        {
            
           
            Car crashed = getIntersectingObjects(Car.class).get(0);
            getWorld().addObject(new GameOver(crashed.name + " Lost"), 600, 320);
            
            crashed.destroy();
            explode();
        }
        else if(!getIntersectingObjects(Debris.class).isEmpty())
        {
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(getIntersectingObjects(Debris.class).get(0));
            getWorld().removeObject(this);
        }
    }    
    
    public void explode()
    {
        placeDebris(getX(), getY(), 10);
        getWorld().removeObject(this);
    }
    
    private void placeDebris(int x, int y, int frags)
    {
        for(int i = 0; i < frags; i++)
        {
            getWorld().addObject(new Debris(), x, y);
        }
    }
    
}
