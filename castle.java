import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class castle extends World
{

    /**
     * Constructor for objects of class castle.
     * 
     */
    private counter score;
    private counter level;
    
    private Personaje diego;
    private Plataforma plat;
    private Plataforma plat1;
    private Plataforma plat2;
    private Plataforma plat3;
    private Plataforma plat4;
    private Sup1 nivel;
    private Reinicio reset;
    
    public castle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        
        score = new counter("Score: 20" );
        level = new counter("Level: 2" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        nivel = new Sup1();
        reset = new Reinicio();
        addObject(diego,100,600);
        //Plataformas
        addObject(plat,100,700);
        addObject(plat1,250,600);
        addObject(plat2,300,500);
        addObject(plat3,440,400);
        addObject(plat4,550,300);
        addObject(nivel,610,250);
        addObject(reset,100,800);

        addObject(score, 200, 90);
        addObject(level, 200, 60);
    }
}
