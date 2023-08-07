import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sup extends Actor
{
    /**
     * Act - do whatever the Sup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        if (isTouching(Sup.class)) {
            System.out.println("Sup is touching another Sup.");
        }
    }
}
