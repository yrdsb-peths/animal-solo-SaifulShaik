import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Saiful Shaik
 * @version May, 11, 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 250, 150);
        prepare();
    }

    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,488,152);
        Label label = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(label,154,266);
        label.setLocation(345,241);
        label.setLocation(302,252);
        label.setLocation(162,229);
        label.setLocation(162,229);
        label.setLocation(235,230);
        label.setLocation(256,261);
        label.setLocation(280,258);
        label.setLocation(240,276);
        Label label2 = new Label("Press <Space> to Start", 50);
        addObject(label2,281,352);
        label2.setLocation(308,358);
        label2.setLocation(310,353);
        label.setLocation(299,219);
        label.setLocation(239,216);
        label.setLocation(230,251);
        label.setLocation(309,296);
    }
}
