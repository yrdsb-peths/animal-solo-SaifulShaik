import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author Saiful Shaik
 * @version April, 30, 2025
 */
public class Elephant extends Actor
{
    public Elephant() {
        setImage("images/elephant.png");
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-1);
        } else if(Greenfoot.isKeyDown("right")) {
            move(1);
        }
        
        // Remove the apple if the elephant eats it
        eat();
    }
    
    /**
     *  When elephant eats the apple it randomly spawns a new apple
     */
    public void eat() {
        if(isTouching(Apple.class)) {
            MyWorld world = (MyWorld) getWorld();
            removeTouching(Apple.class);
            world.createApple();
        }
    }
}
