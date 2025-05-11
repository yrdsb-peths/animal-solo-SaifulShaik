import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author Saiful Shaik
 * @version April, 30, 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantsound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    public Elephant() {
        for(int i = 0; i < idle.length; i++) {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant() {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
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
        
        animateElephant();
    }
    
    /**
     *  When elephant eats the apple it randomly spawns a new apple
     */
    public void eat() {
        if(isTouching(Apple.class)) {
            MyWorld world = (MyWorld) getWorld();
            removeTouching(Apple.class);
            world.createApple();
            world.increaseScore();
            elephantsound.play();
        }
    }
}
