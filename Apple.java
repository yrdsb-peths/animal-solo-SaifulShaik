import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author Saiful Shaik 
 * @version April, 30, 2025
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+1);
    }
}
