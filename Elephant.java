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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Elephant() {
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant() {
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        
        animationTimer.mark();
        
        if(facing.equals("right")) {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }

    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-2);
            facing = "left";
        } else if(Greenfoot.isKeyDown("right")) {
            move(2);
            facing = "right";
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
