import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tempestad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tempestad extends World
{

private counter score;
    private counter level;
    
    private Personaje diego;
    private Plataforma plat;
    private Plataforma plat1;
    private Plataforma plat2;
    private Plataforma plat3;
    private Plataforma plat4;
    private Plataforma plat5;
    private Sup5 nivel;
    private Reinicio reset;
    private Monstruo mon;
    
    public Tempestad()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1);
        
        score = new counter("Score: 60" );
        level = new counter("Level: 6" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        plat5 = new Plataforma();
        nivel = new Sup5();
        reset = new Reinicio();
        mon = new Monstruo();
        
        addObject(diego,100,600);
        //Plataformas
        addObject(plat,60,810);
        addObject(plat1,190,700);
        addObject(plat2,310,630);
        addObject(plat3,460,490);
        addObject(plat4,550,300);
        addObject(plat5,700,200);
        addObject(nivel,810,150);
        addObject(reset,100,1000);
        addObject(mon, 500, 1000);
        
        addObject(score, 200, 90);
        addObject(level, 200, 60);
    }
}