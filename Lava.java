import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lava extends World
{

    private counter score;
    private counter level;
    
    private Personaje diego;
    private Plataforma plat;
    private Plataforma plat1;
    private Plataforma plat2;
    private Plataforma plat3;
    private Plataforma plat4;
    private Sup3 nivel;
    private Reinicio reset;
    private Monstruo mon;
    public Lava()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 900, 1);
        
        score = new counter("Score: 40" );
        level = new counter("Level: 4" );
        diego = new Personaje();
        plat = new Plataforma();
        plat1 = new Plataforma();
        plat2 = new Plataforma();        
        plat3 = new Plataforma();
        plat4 = new Plataforma();
        nivel = new Sup3();
        reset = new Reinicio();
        mon = new Monstruo();
        
        addObject(diego,100,600);
        //Plataformas
        addObject(plat,100,770);
        addObject(plat1,250,600);
        addObject(plat2,310,500);
        addObject(plat3,460,400);
        addObject(plat4,590,300);
        addObject(nivel,680,100);
        addObject(reset,50, 900);
        addObject(mon,400, 900);
        
        addObject(score, 200, 90);
        addObject(level, 200, 60);
    }
}
