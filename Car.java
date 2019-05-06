import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (Not JIgme) 
 * @version (a version number or a date)
 */
public class Car extends SmoothMover
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int width = 1200;
    public static int height = 720;
    private double acceleration = 0.07;
    private double speed = 0;
    private String up = "W", left = "A", right = "D";
    public String name = "";
    
    public Car (String name)
    {
        this.name = name;
    }

    public void destroy()
    {
        getWorld().addObject(new Explosion(), getX(), getY());
        getWorld().removeObject(this);
    }
    
    public void changeControls(String up, String left, String right)
    {
        this.up = up;
        this.left = left;
        this.right = right;
    }
    
    private void accelerate()
    {
            if(Greenfoot.isKeyDown(this.up))
            {
                this.speed += this.acceleration;
            }
            else if(this.speed > 0)
            {
                this.speed -= this.acceleration;
            }
            if(checkCollide((int)speed))
            {
                turn(Greenfoot.getRandomNumber(150));
                speed = 2;
            }
            move(this.speed);
            if(this.speed > 3) this.speed = 3;
            else if(this.speed <=0) this.speed = 0;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown(this.left))
        {
            turn(-3);
        }
        else if(Greenfoot.isKeyDown(this.right))
        {
            turn(3);
        }
        
        accelerate();
        //wrapover();
    }
    
    private void wrapover()
    {
        int currX = getX();
        int currY = getY();
        
        setLocation((currX + this.width) % this.width,
                    (currY + this.height) % this.height);
    }
    
    private boolean checkCollide(int off)
    {
        int dx = (int) (Math.cos(Math.toRadians(getRotation())) * off);
        int dy = (int) (Math.sin(Math.toRadians(getRotation())) * off);
        Actor obstacle = getOneObjectAtOffset(dx,dy, Car.class);
        if(obstacle != null)
        {
            return true;
        }
        return false;
    }
}
