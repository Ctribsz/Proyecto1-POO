import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aire extends World
{

 private counter score;
    private counter level;
    
    private Personaje diego;
    private Plataforma plat;
    private Plataforma plat1;
    private Plataforma plat2;
    private Plataforma plat3;
    private Plataforma plat4;
    private Sup4 nivel;
    private Reinicio reset;
    
    private Monstruo mon;
    public Aire()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 950, 1);
        
        score = new counter("Score: 50" );
        level = new counter("Level: 5" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        nivel = new Sup4();
        mon = new Monstruo();
        reset = new Reinicio();
        
        addObject(diego,100,600);
        //Plataformas
        addObject(plat,70,810);
        addObject(plat1,200,690);
        addObject(plat2,350,510);
        addObject(plat3,480,450);
        addObject(plat4,610,300);
        addObject(nivel,700,150);
        addObject(mon,425,950);
        addObject(reset,100,950);

        addObject(score, 200, 90);
        addObject(level, 200, 60);
    }
}
