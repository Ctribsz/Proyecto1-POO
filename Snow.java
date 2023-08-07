import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snow extends World
{

    /**
     * Constructor for objects of class Snow.
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
    private Reinicio reset;
    
    private Sup2 nivel;
    public Snow()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1);
        
        score = new counter("Score: 30" );
        level = new counter("Level: 3" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        nivel = new Sup2();
        reset = new Reinicio();

        addObject(diego,100,600);
        //Plataformas
        addObject(plat,100,700);
        addObject(plat1,210,600);
        addObject(plat2,250,500);
        addObject(plat3,370,380);
        addObject(plat4,450,300);
        addObject(nivel,570,150);
        addObject(reset,100,800);

        addObject(score, 200, 90);
        addObject(level, 200, 60);
        
    }
}