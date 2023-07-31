import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{

    /**
     * Constructor for objects of class Sky.
     * 
     */
    private counter score;
    private counter level;
    
    public Sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        
        score = new counter("Score: " );
        level = new counter("Level: " );
        addObject(score, 140, 90);
        addObject(level, 140, 60);
    }
    public void setUpMap(){
        Monstruo enemy = new Monstruo();
        addObject(enemy, 100, 100); // Coloca el objeto "Player" en la posición (100, 100)

        Personaje player = new Personaje();
        addObject(player, 150, 150); // Coloca el objeto "Enemy" en la posición (700, 500)

    }
}
