import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author Saiful Shaik 
 * @version April, 30, 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    public Apple() {
        setImage("images/apple1.png");
    }
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY()+1;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
}
